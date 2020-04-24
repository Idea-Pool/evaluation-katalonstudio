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

WebUI.navigateToUrl(GlobalVariable.bootstrapUrls.checkboxes)

WebUI.verifyElementClickable(radioButtonByIDNumber(1))

WebUI.verifyElementNotClickable(radioButtonByIDNumber(3))

WebUI.verifyElementChecked(radioButtonByIDNumber(1), 0)

WebUI.verifyElementNotChecked(radioButtonByIDNumber(2), 0)

WebUI.click(radioButtonByIDNumber(2))

WebUI.verifyElementNotChecked(radioButtonByIDNumber(1), 0)

WebUI.verifyElementChecked(radioButtonByIDNumber(2), 0)

TestObject radioButtonByIDNumber(int number) {
	String cssString = "input#exampleRadios${number}"

	TestObject radioButton = new TestObject('RadioButton')

	radioButton.addProperty('css', ConditionType.EQUALS, cssString)

	return radioButton
}