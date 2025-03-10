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

WebUI.callTestCase(findTestCase('Scenario/Functional Testing/TC-02-Booking Appointment/Booking Appointment Successfuly'), [
        ('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM', ('facility') : 'Tokyo CURA Healthcare Center'
        , ('visit_date') : '07/10/2024', ('comment') : 'Komen Medicaid', ('healthcare_program') : 'Medicaid', ('hospital_readmission') : 'false'], 
    FailureHandling.STOP_ON_FAILURE)

'Step2'
WebUI.click(findTestObject('TC-00-Menu Toggle/a_menu toggle'))

'Step3'
WebUI.click(findTestObject('TC-00-Menu Toggle/a_history'))

'Step4'
WebUI.verifyElementText(findTestObject('TC-03-Cek History/h2_history'), 'History')

'Step5'
WebUI.click(findTestObject('TC-03-Cek History/div_facility'))

