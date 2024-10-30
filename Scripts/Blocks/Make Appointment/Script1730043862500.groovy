import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Step1'
WebUI.selectOptionByValue(findTestObject('TC-02-Booking Appointment/select_facility'), facility, true)

//WebUI.check(findTestObject('TC-02-Booking Appointment/check_hospital readmission'))
'Step2'
if (hospital_readmission== 'true') {
    WebUI.check(findTestObject('TC-02-Booking Appointment/check_hospital readmission'))
}

//WebUI.click(findTestObject('TC-02-Booking Appointment/radio_medicaid programs'))
'Step3'
def select_radio = healthcare_program

switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Booking Appointment/radio_medicare programs'))

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Booking Appointment/radio_medicaid programs'))

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Booking Appointment/radio_none programs'))
    default:
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Booking Appointment/radio_none programs'))}

'Step4'
WebUI.setText(findTestObject('TC-02-Booking Appointment/input_visit date'), visit_date)

'Step5'
WebUI.setText(findTestObject('TC-02-Booking Appointment/textarea_comment'), comment)

Thread.sleep(1000)

'Step6'
WebUI.click(findTestObject('TC-02-Booking Appointment/btn_book appointment'))

'Step8'
WebUI.delay(5)

'Step9'
WebUI.verifyElementVisible(findTestObject('TC-05-Appointment Confirmation/h2_appointment confirmation'))

'Step10'
WebUI.verifyElementVisible(findTestObject('TC-05-Appointment Confirmation/p_please be informed'))

'Step11'
WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_facility'), facility)

//WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_apply for hospital'), hospital_readmission)
'Step12'
if (hospital_readmission == 'true') {
    WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_apply for hospital'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_apply for hospital'), 'No')
}

//WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_healthcare program'), healthcare_program)
'Step13'
switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_healthcare program'), 'Medicare')

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_healthcare program'), 'Medicaid')

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_healthcare program'), 'None')
    default:
        println(select_radio)

        WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_healthcare program'), 'None')}

'Step14'
WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_visit date'), visit_date)

'Step15'
WebUI.verifyElementText(findTestObject('TC-05-Appointment Confirmation/p_comment'), comment)

