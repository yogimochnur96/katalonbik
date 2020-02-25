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

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Phone email or username_sessionusername_or_email'), 'VitaVitaris')

WebUI.setText(findTestObject('Maintenance/Halaman Login/input_Password_sessionpassword'), '@gemay99')

WebUI.click(findTestObject('Maintenance/Halaman Login/div_Log in'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 99)

WebUI.scrollToPosition(0, 99)

WebUI.scrollToPosition(0, 99)

WebUI.scrollToPosition(0, 99)

WebUI.click(findTestObject('Maintenance/Halaman Beranda/div_3Notifikasi'))

WebUI.click(findTestObject('Maintenance/Logout/div_Selengkapnya'))

WebUI.click(findTestObject('Maintenance/Keluar/div_Keluar'))

WebUI.closeBrowser()

