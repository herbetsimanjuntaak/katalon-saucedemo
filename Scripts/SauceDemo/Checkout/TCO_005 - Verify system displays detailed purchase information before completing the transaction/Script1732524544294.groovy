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

WebUI.callTestCase(findTestCase('SauceDemo/Checkout/TCO_001 - Verify user able input buyer information when checkout'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SauceDemo/Checkout/continueButton'))

WebUI.verifyElementText(findTestObject('SauceDemo/MainMenu/titleName'), 'Checkout: Overview')

WebUI.verifyElementVisible(findTestObject('SauceDemo/ProductPage/productList'))

WebUI.verifyElementVisible(findTestObject('SauceDemo/Checkout/CheckoutOverviewPage/quantityItems'))

WebUI.verifyElementVisible(findTestObject('SauceDemo/Checkout/CheckoutOverviewPage/priceTotalLabel'))

