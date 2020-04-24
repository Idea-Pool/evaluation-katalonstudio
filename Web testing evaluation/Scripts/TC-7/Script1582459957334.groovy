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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.bootstrapUrls.formControls)

WebUI.verifyElementVisible(findTestObject('Bootstrap/ExampleSelect'))

WebUI.verifyElementHasAttribute(findTestObject('Bootstrap/MultipleSelect'), 'multiple', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Bootstrap/ExampleSelect'), '1', false, 0)

WebUI.verifyOptionNotPresentByLabel(findTestObject('Bootstrap/ExampleSelect'), 'hello', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Bootstrap/ExampleSelect'), '2', false, 0)

WebUI.selectOptionByLabel(findTestObject('Bootstrap/ExampleSelect'), '2', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Bootstrap/ExampleSelect'), '2', false, 0)

WebUI.verifyEqual(WebUI.getNumberOfTotalOption(findTestObject('Bootstrap/ExampleSelect')), 5)

