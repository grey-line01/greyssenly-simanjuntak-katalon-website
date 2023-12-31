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

def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

println('usernamenya: ' +username)

println('random numbernya: ' +randomNumber)

def username = username+randomNumber

println('username barunya: ' +username)


//def valuedariKeyword = CustomKeywords.'kw.utility.randomNumber.RandomNumber5'()
//println('value random 5 dari keyword: ' +valuedariKeyword)

def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

println('value random custom defined dari keyword: ' +randomDefinedNumber)

def email = 'username'+randomDefinedNumber+'@gmail.com'

println(email)

WebUI.openBrowser('https://www.advantageonlineshopping.com/#/register')

WebUI.setText(findTestObject('Register/inpt__usernameRegisterPage'), username)

WebUI.setText(findTestObject('Register/inpt__emailRegisterPage'), email)

WebUI.setText(findTestObject('Object Repository/Register/inpt_passwordRegisterPage'), password)

WebUI.setText(findTestObject('Register/inpt__confirm_passwordRegisterPage'), password)

WebUI.setText(findTestObject('Register/inpt_first_nameRegisterPage'), firstname)

WebUI.delay(5)

WebUI.closeBrowser()

