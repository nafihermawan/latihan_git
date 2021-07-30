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

Scanner scan = new Scanner(System.in);

System.out.print();

System.out.print();

switch(caseNumber){
	case 1:
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	WebUI.setText(findTestObject('Login/input_username'), '"Admin"')
	WebUI.setEncryptedText(findTestObject('Login/Input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
	
	def actual = WebUI.getText(findTestObject('orangeHRM/Message'))
	
	WebUI.verifyMatch(actual, data.getValue('expected result', rowlogin), false)	
	break
	
	case 2:
	println("case 2 dieksekusi")
	
	def data = findTestData('orangeCob1/NewTestData')

	for (def rowlogin = 1; rowlogin <= data.getRowNumbers(); rowlogin++) {
    WebUI.setText(findTestObject('Login/input_username'), data.getValue('username', rowlogin))
    WebUI.setText(findTestObject('Login/Input_password'), data.getValue('password', rowlogin))
	WebUI.click(findTestObject('null'))
	
	def actual = WebUI.getText(findTestObject('orangeHRM/Message'))
	
	WebUI.verifyMatch(actual, data.getValue('expected result', rowlogin), false)}

	break
	
	case 500:
	println("case 500 dieksekusi")
	WebUI.openBrowser('')
	WebUI.maximizeWindow()
	WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	
	break
	
	case 1754:
	println("Case 1754 dieksekusi")
	
	break
	
	default:
	println("Case default dieksekusi")
	break
	
}