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

WebUI.callTestCase(findTestCase('Reusable_Test_Case/Reusable_Test_Case'), [('username') : 'langit', ('password') : 'Langit123\r\n'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddToCart/btn_Sign out_search'))

WebUI.click(findTestObject('AddToCart/btn_search'))

WebUI.setText(findTestObject('Object Repository/AddToCart/inpt_search'), 'Speakers')

WebUI.click(findTestObject('Object Repository/AddToCart/img'))

WebUI.waitForElementPresent(findTestObject('AddToCart/txt_HP ROAR MINI WIRELESS SPEAKER'), 0)

WebUI.verifyElementPresent(findTestObject('AddToCart/txt_HP ROAR MINI WIRELESS SPEAKER'), 0)

WebUI.verifyElementPresent(findTestObject('AddToCart/txt_44.99'), 0)

WebUI.verifyElementPresent(findTestObject('AddToCart/txt_Color'), 0)

WebUI.verifyElementPresent(findTestObject('AddToCart/txt_Quantity'), 0)

WebUI.click(findTestObject('Object Repository/AddToCart/btn_color'))

WebUI.click(findTestObject('Object Repository/AddToCart/btn_Quantity_plus'))

WebUI.click(findTestObject('Object Repository/AddToCart/btn_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/AddToCart/btn_HP ROAR MINI WIRELESS SPEAKER'))

WebUI.closeBrowser()

