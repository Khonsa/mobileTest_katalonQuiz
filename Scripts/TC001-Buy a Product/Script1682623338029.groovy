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

Mobile.startApplication('E:\\Android-MyDemoAppRN.1.2.0.build-231_2.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.scrollToText('Log In')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Log In'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), 'bob@example.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText (1)'), 'dbXIBZ66cuht4KTRMDozZw==', 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.scrollToText('add to cart')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Rebecca Winter'), 'rika', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Mandorley 112'), 'tes 123', 0)

Mobile.scrollToText('country')

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Truro'), 'mawar', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Cornwall'), 'melati', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 89750'), '12345', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - United Kingdom'), 'indonesia', 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Rebecca Winter (1)'), 'rika', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 3258 1265 7568 789'), '123456781234567', 0)

Mobile.scrollToText('security')

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0325'), '08/47', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0847'), '04/12', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 123'), '123', 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (4)'), 0)

Mobile.scrollToText('pay')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (6)'), 0)

Mobile.closeApplication()

