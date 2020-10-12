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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

for (def rowNum = 1; rowNum <= findTestData('Test Data File Excel').getRowNumbers(); rowNum++) {
    WebUI.navigateToUrl(findTestData('Test Data File Excel').getValue(1, rowNum))

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), findTestData(
            'Test Data File Excel').getValue(2, rowNum))

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), findTestData(
            'Test Data File Excel').getValue(3, rowNum))

    Thread.sleep(6000)
}

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.closeBrowser()

