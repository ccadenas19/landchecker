package signup
import static org.junit.Assert.assertTrue

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import pages.SignUpPage



class SignUpStep {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	private SignUpPage signUpPage;

	SignUpStep () {
		this.signUpPage = new SignUpPage();
	}

	@Given("I am in landchecker signup page")
	def goToSignup() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://app.landchecker.com.au/join')
		WebUI.maximizeWindow();
	}

	@When("the required fields are empty")\
	def emptyRequiredFields() {
		WebUI.clearText(signUpPage.firstName);
		WebUI.clearText(signUpPage.lastName);
		WebUI.clearText(signUpPage.emailAdd);
		WebUI.clearText(signUpPage.password);
	}

	@And("I input (.*) in the (.*) field")
	def setValueToField(String value, String field) {
		//WebUI.scrollToElement(signUpPage.getInputTestObject(field), 0)
		WebUI.click(signUpPage.getInputTestObject(field))
		WebUI.sendKeys(signUpPage.getInputTestObject(field), value)
		WebUI.sendKeys(signUpPage.getInputTestObject(field), Keys.chord(Keys.TAB))
	}

	@Then("I should see (.*) in the (.*) field")
	def verifyFieldErrorMessage(String error, String errorField) {
		
		String xpath  = signUpPage.getInputTestObject(errorField).getSelectorCollection().get(SelectorMethod.XPATH) + "//parent::*/following-sibling::p[text()=\""+ error +"\"]"
		TestObject errorTag = new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath);
		
		WebUI.verifyElementPresent(errorTag, 5)
		String errorMessage = WebUI.getText(errorTag)
		assertTrue(error.equals(errorMessage))
	}

	@And("I should see (.*) displayed under the Terms Of Use checkbox")
	def verifyTermsOfUseRequiredErrorShows(String error) {
		String xpath  = "//p[text()='" + error +"']"
		TestObject errorTag = new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath);
		
		WebUI.verifyElementPresent(errorTag, 5)
		String errorMessage = WebUI.getText(errorTag)
		assertTrue(error.equals(errorMessage))
	}

	@And ("I click on Signup button")
	def clickSignUpBtn() {
		WebUI.click(signUpPage.signupButton)
	}
}