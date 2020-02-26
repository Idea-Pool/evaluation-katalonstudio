import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.angularUrls.homePage)

WebUI.verifyElementVisible(findTestObject('AngularHomePage/SearchBar'))

WebUI.verifyElementText(findTestObject('AngularHomePage/SearchBar'), '')

WebUI.verifyElementAttributeValue(findTestObject('AngularHomePage/SearchBar'), 'placeholder', 'Search', 0)

WebUI.click(findTestObject('AngularHomePage/SearchBar'))

WebUI.sendKeys(findTestObject('AngularHomePage/SearchBar'), 'directive')

WebUI.verifyElementVisible(searchResultByTextAndSection('api', 'Directive'))

WebUI.click(searchResultByTextAndSection('api', 'Directive'))

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.angularUrls.directive, false)

WebUI.verifyElementText(findTestObject('AngularAPIPages/PageTitle'), 'Directive')

TestObject searchResultByTextAndSection(String section, String result) {
    String xpathString = "//div[contains(@class,\"search-area\")][h3[contains(.,\"${section}\")]]//a[contains(@class,\"search-result-item\")]/span[.=\"${result}\"]"

    TestObject searchResult = new TestObject('SearchResult')

    searchResult.addProperty('xpath', ConditionType.EQUALS, xpathString)

    return searchResult
}

