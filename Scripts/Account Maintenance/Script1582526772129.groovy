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

WebUI.click(findTestObject('Maintenance/Halaman Awal/div_Log in'))

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Phone email or username_sessionusername_or_email'), 'Maahkinderjoy')

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Password_sessionpassword'), 'alamsyah333')

WebUI.click(findTestObject('Maintenance/Halaman Login/div_Log in'))

WebUI.delay(10)

not_run: WebUI.scrollToPosition(0, 9)

not_run: WebUI.delay(10)

not_run: WebUI.scrollToPosition(0, 99)

not_run: WebUI.delay(10)

not_run: WebUI.scrollToPosition(0, 999)

not_run: WebUI.delay(10)

not_run: WebUI.scrollToPosition(0, 9999)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.HOME))

WebUI.setText(findTestObject('Maintenance/Search Mutualan'), 'mutualan rt')

WebUI.click(findTestObject('Maintenance/Klik Span Mutualan RT'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

WebUI.click(findTestObject('Maintenance/Klik Tweet Pertama Mutualan'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Klik Retweet'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Follow 1'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Follow 2'))

WebUI.delay(20)

WebUI.click(findTestObject('Maintenance/Follow 3'))

WebUI.delay(15)

WebUI.click(findTestObject('Maintenance/Follow 4'))

WebUI.delay(10)

WebUI.click(findTestObject('Maintenance/Follow 5'))

WebUI.delay(15)

WebUI.click(findTestObject('Maintenance/Button Close'))

WebUI.delay(5)

WebUI.click(findTestObject('Maintenance/Button Home'))

not_run: WebUI.click(findTestObject('Maintenance/Halaman Beranda/div_3Notifikasi'))

WebUI.click(findTestObject('Maintenance/Logout/div_Selengkapnya'))

WebUI.click(findTestObject('Maintenance/Keluar/div_Keluar'))

WebUI.closeBrowser()

