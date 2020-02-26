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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://twitter.com')

WebUI.delay(5)

WebUI.click(findTestObject('Maintenance/Halaman Awal/div_Log in'))

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Phone email or username_sessionusername_or_email'), findTestData(
        'data1').getValue(1, 2))

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Password_sessionpassword'), findTestData('data1').getValue(
        2, 2))

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

WebUI.click(findTestObject('Maintenance/Button Notifikasi'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Notification Mention'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Button Message'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Button List'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/List Subscribed'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/List Member'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Button Profile'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Tweet and Replies'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Profile - Media'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Profile - Likes'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Button Home'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Logout/div_Selengkapnya'))

WebUI.click(findTestObject('Maintenance/Setting and Privacy'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - Privacy and safety'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - Notification'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - Content preferences'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - Display'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - Data Usage'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - Accessibility'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Setting - About Twitter'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Button Home'))

WebUI.delay(15)

WebUI.click(findTestObject('Maintenance/Logout/div_Selengkapnya'))

WebUI.delay(5)

WebUI.click(findTestObject('Maintenance/Keluar/div_Keluar'))

WebUI.closeBrowser()

