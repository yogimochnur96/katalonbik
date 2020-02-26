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

WebUI.navigateToUrl('https://twitter.com')

WebUI.delay(5)

WebUI.click(findTestObject('Maintenance/Halaman Awal/div_Log in'))

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Phone email or username_sessionusername_or_email'), findTestData(
        'data1').getValue(1, 1))

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Password_sessionpassword'), findTestData('data1').getValue(
        2, 1))

WebUI.click(findTestObject('Maintenance/Halaman Login/div_Log in'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 9)

WebUI.delay(10)

WebUI.scrollToPosition(0, 99)

WebUI.delay(10)

WebUI.scrollToPosition(0, 999)

WebUI.delay(10)

WebUI.scrollToPosition(0, 9999)

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Maintenance/Search Mutualan'), 'mutualan rt')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Maintenance/Klik Span Mutualan RT'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(20)

not_run: WebUI.click(findTestObject('Maintenance/Klik Tweet Pertama Mutualan'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Klik Retweet'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Follow 1'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Follow 2'))

not_run: WebUI.delay(20)

not_run: WebUI.click(findTestObject('Maintenance/Follow 3'))

not_run: WebUI.delay(15)

not_run: WebUI.click(findTestObject('Maintenance/Follow 4'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Follow 5'))

not_run: WebUI.delay(15)

not_run: WebUI.click(findTestObject('Maintenance/Button Close'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Maintenance/Button Home'))

not_run: WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Button Explore'))

WebUI.delay(5)

WebUI.click(findTestObject('Maintenance/Show More Hastag'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 9)

WebUI.delay(10)

WebUI.scrollToPosition(0, 99)

WebUI.delay(10)

WebUI.scrollToPosition(0, 999)

WebUI.delay(10)

WebUI.scrollToPosition(0, 9999)

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Maintenance/Button Notifikasi'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Notification Mention'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Button Message'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Button List'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/List Subscribed'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/List Member'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Button Profile'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Tweet and Replies'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Profile - Media'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Profile - Likes'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Button Home'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Logout/div_Selengkapnya'))

not_run: WebUI.click(findTestObject('Maintenance/Setting and Privacy'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - Privacy and safety'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - Notification'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - Content preferences'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - Display'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - Data Usage'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - Accessibility'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Setting - About Twitter'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Maintenance/Button Home'))

not_run: WebUI.delay(15)

WebUI.click(findTestObject('Maintenance/Logout/div_Selengkapnya'))

WebUI.delay(5)

WebUI.click(findTestObject('Maintenance/Keluar/div_Keluar'))

WebUI.closeBrowser()

