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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String username = faker.name().username()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Login/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Login/Input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Login/btnLogin'))

WebUI.click(findTestObject('PIM/navPIM'))

WebUI.click(findTestObject('PIM/btnAdd'))

WebUI.setText(findTestObject('PIM/input_firstName'), username)

WebUI.setText(findTestObject('PIM/input_midName'), 'Ahmad')

WebUI.setText(findTestObject('PIM/input_lastName'), username)

WebUI.uploadFile(findTestObject('PIM/uploadFile'), 'C:\\Users\\nafih_000\\Downloads\\1.jpg')

WebUI.click(findTestObject('PIM/chkLogin'))

WebUI.setText(findTestObject('PIM/input_username'), 'username')

WebUI.setEncryptedText(findTestObject('PIM/input_password'), 'MMmK6wIqkKvscU91pI/XNg==')

WebUI.setEncryptedText(findTestObject('PIM/input_rePassword'), 'MMmK6wIqkKvscU91pI/XNg==')

WebUI.click(findTestObject('PIM/btnSave'))

WebUI.verifyMatch('', '', false)

