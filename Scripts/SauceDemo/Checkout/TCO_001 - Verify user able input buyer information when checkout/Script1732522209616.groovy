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

WebUI.callTestCase(findTestCase('SauceDemo/Products/TCP_003 - Verify system increases the number of items added each time a user adds a product'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SauceDemo/MainMenu/iconCart'))

WebUI.click(findTestObject('SauceDemo/CartPage/checkoutButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SauceDemo/MainMenu/titleName'), 'Checkout: Your Information')

WebUI.setText(findTestObject('SauceDemo/Checkout/firstNameInput'), 'putra')

WebUI.setText(findTestObject('SauceDemo/Checkout/lastNameInput'), 'putri')

WebUI.setText(findTestObject('SauceDemo/Checkout/postalCodeInput'), '10110')


def firstNameValue = WebUI.getAttribute(findTestObject('SauceDemo/Checkout/firstNameInput'), 'value')
WebUI.verifyEqual(firstNameValue, 'putra', FailureHandling.STOP_ON_FAILURE)


def lastNameValue = WebUI.getAttribute(findTestObject('SauceDemo/Checkout/lastNameInput'), 'value')
WebUI.verifyEqual(lastNameValue, 'putri', FailureHandling.STOP_ON_FAILURE)


def postalCodeValue = WebUI.getAttribute(findTestObject('SauceDemo/Checkout/postalCodeInput'), 'value')
WebUI.verifyEqual(postalCodeValue, '10110', FailureHandling.STOP_ON_FAILURE)

