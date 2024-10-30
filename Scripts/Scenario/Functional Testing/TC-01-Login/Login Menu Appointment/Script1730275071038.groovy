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

'Step 1\r\n'
WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

'Step 2\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/TC-01-Login/h1_cura healthcare service'), 'CURA Healthcare Service')

'Step 3\r\n'
WebUI.callTestCase(findTestCase('Blocks/Login with Appointment'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

'Step 4'
if (testType == 'P') {
    WebUI.verifyElementVisible(findTestObject('TC-02-Booking Appointment/h2_make appointment'))
} else {
    'Step 5'
    WebUI.verifyElementVisible(findTestObject('TC-01-Login/msg_login failed'))
}

'Step 6'
WebUI.callTestCase(findTestCase('Blocks/Close browser'), [:], FailureHandling.STOP_ON_FAILURE)

