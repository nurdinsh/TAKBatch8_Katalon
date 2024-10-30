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

'Step4'
WebUI.click(findTestObject('Object Repository/TC-01-Login/a_make appointment'))

'Step5'
WebUI.verifyElementText(findTestObject('TC-01-Login/h2_login'), 'Login')

'Step6'
if (username != 'none') {
	WebUI.setText(findTestObject('Object Repository/TC-01-Login/input_username'), username)
}

'Step7'
if(password != 'none') {
WebUI.setEncryptedText(findTestObject('Object Repository/TC-01-Login/input_password'), password)
}

Thread.sleep(1000)

'Step8'
WebUI.click(findTestObject('Object Repository/TC-01-Login/btn_login'))

