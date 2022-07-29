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

WebUI.click(findTestObject('Object Repository/Card/Page_Boards  Trello/div_Testing AUTOMATION'))

WebUI.click(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/a_Add a card'))

WebUI.setText(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/textarea_To Do_list-card-composer-textarea _714487'), 
    'NEW Test 2')

WebUI.click(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/input_To Do_nch-button nch-button--primary _69b742'))

WebUI.click(findTestObject('Object Repository/Card/Page_Testing AUTOMATION  Trello/span_4NEW Test 2'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/a_Labels'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/a_Labels_card-label-edit-button icon-sm ico_2d3115'))

WebUI.setText(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Name_name'), 'AUTOMATED')

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Select a color_nch-button nch-button-_11bfd3'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/span_AUTOMATED'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/a_Labels_card-label-edit-button icon-sm ico_2d3115'))

WebUI.click(findTestObject('Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/a_Labels_pop-over-header-close-btn icon-sm icon-close'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/span_Checklist'))

WebUI.setText(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Title_id-checklist'), 
    'AUTOMATED Checklist')

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Select a color_nch-button nch-button-_11bfd3'))

WebUI.setText(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/textarea_Add an item_edit field checklist-n_946f0c'), 
    'AUTOMATED Step 1')

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Select a color_nch-button nch-button-_11bfd3'))

WebUI.setText(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/textarea_Add an item_edit field checklist-n_946f0c'), 
    'AUTOMATED STEP 2')

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Select a color_nch-button nch-button-_11bfd3'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/button_Dates'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Due date_nch-textfield__input Hj0IB7n_b442cf'))

WebUI.setText(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/input_Due date_nch-textfield__input Hj0IB7n_b442cf'), 
    '12:00 PM')

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/div_Set due date reminder_css-191o3mb'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/div_Set due date reminder_css-191o3mb'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/div_1'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/button_Save'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/span_Dates'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/button_Aug 1 at 1200 PM'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/div_27'))

WebUI.click(findTestObject('Object Repository/Card/Page_NEW Test 2 on Testing AUTOMATION  Trello/button_Save'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

