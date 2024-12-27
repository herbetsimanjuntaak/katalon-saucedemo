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

WebUI.callTestCase(findTestCase('SauceDemo/Login/TCL_001- Login with valid username and password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SauceDemo/MainMenu/sortingDropdown'), 10)

WebUI.selectOptionByValue(findTestObject('SauceDemo/MainMenu/sortingDropdown'), 'az', false)

WebUI.waitForElementVisible(findTestObject('SauceDemo/ProductPage/productList'), 10)

List<String> sortedProductNames = []

def productElements = WebUI.findWebElements(findTestObject('SauceDemo/ProductPage/productList'), 10)

for (def element : productElements) {
    sortedProductNames.add(element.getText())
}

List<String> expectedSortedProductNames = new ArrayList(sortedProductNames)

Collections.sort(expectedSortedProductNames)

WebUI.verifyEqual(sortedProductNames, expectedSortedProductNames)

WebUI.verifyElementVisible(findTestObject('SauceDemo/ProductPage/productList'))

