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

'Step 1'
WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

'Step 2'
WebUI.callTestCase(findTestCase('Blocks/Login with Toggle'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

'Step 3'
WebUI.selectOptionByValue(findTestObject('TC-02-Booking Appointment/select_facility'), facility, false)

'Step 4'
WebUI.check(findTestObject('TC-02-Booking Appointment/check_hospital readmission'))

'Step 5'
WebUI.click(findTestObject('TC-02-Booking Appointment/radio_medicare programs'))

'Step 6'
WebUI.setText(findTestObject('TC-02-Booking Appointment/textarea_comment'), comment)

'Step 7\r\n'
WebUI.click(findTestObject('TC-02-Booking Appointment/btn_book appointment'))

'Step 8'
WebUI.verifyElementNotPresent(findTestObject('TC-02-Booking Appointment/alert'), 0)

WebUI.callTestCase(findTestCase('Blocks/Close browser'), [:], FailureHandling.STOP_ON_FAILURE)

