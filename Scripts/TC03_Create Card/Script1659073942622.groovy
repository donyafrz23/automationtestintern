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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://trello.com/login')

WebUI.setText(findTestObject('Object Repository/Card/Page_Log in to Trello/input_Log in to Trello_user'), 'afrz.dony@gmail.com')

WebUI.click(findTestObject('Object Repository/Card/Page_Log in to Trello/input_concat(Don, , t ask for codes when I _e2894b'))

WebUI.setEncryptedText(findTestObject('Object Repository/Card/Page_Log in to continue - Log in with Atlas_6762ee/input_afrz.donygmail.com_password'), 
    'XGe0gXndYtGSLAyxzDAhWw==')

WebUI.click(findTestObject('Object Repository/Card/Page_Log in to continue - Log in with Atlas_6762ee/button_Log in'))

WebUI.click(findTestObject('Object Repository/Card/Page_Boards  Trello/div_BoardsTemplatesHomeWorkspacesTTrello Wo_add512'))

WebUI.click(findTestObject('Object Repository/Card/Page_Boards  Trello/div_Testing AUTOMATION'))

WebUI.click(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/span_Add a card'))

WebUI.setText(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/textarea_To Do_list-card-composer-textarea _714487'), 
    'New TESTING 1')

WebUI.click(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/input_To Do_nch-button nch-button--primary _69b742'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

