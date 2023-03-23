package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SignUpPage {

	private TestObject firstName = findTestObject('Object Repository/signupPage/fname');
	private TestObject lastName = findTestObject('Object Repository/signupPage/lname');
	private TestObject emailAdd = findTestObject('Object Repository/signupPage/emailad');\
	private TestObject occupation = findTestObject('Object Repository/signupPage/occupation');
	private TestObject password = findTestObject('Object Repository/signupPage/password');
	private TestObject acceptTerms = findTestObject('Object Repository/signupPage/acceptedTermsChk');
	private TestObject signupButton = findTestObject('Object Repository/signupPage/signupBtn');
	private TestObject logo = findTestObject('Object Repository/signupPage/logo');
	
	private TestObject firstNameRequiredError = findTestObject('Object Repository/signupPage/fname_required_error');
	private TestObject lastNameRequiredError = findTestObject('Object Repository/signupPage/lname_required_error');
	private TestObject emailAddRequiredError = findTestObject('Object Repository/signupPage/emailad_required_error');
	private TestObject occupationRequiredError = findTestObject('Object Repository/signupPage/occupation_required_error');
	private TestObject passwordRequiredError = findTestObject('Object Repository/signupPage/password_required_error');
	private TestObject acceptTermsRequiredError = findTestObject('Object Repository/signupPage/acceptedTermsChk_required_error');
	
	
	private TestObject firstNameInvalidError = findTestObject('Object Repository/signupPage/fname_invalid_error');
	private TestObject lastNameInvalidError = findTestObject('Object Repository/signupPage/lname_invalid_error');
	private TestObject emailAddInvalidError = findTestObject('Object Repository/signupPage/emailad_invalid_error');

	public TestObject getInputTestObject(String fieldName) {
		switch (fieldName) {
			case "first_name":
				return this.firstName;
			case "last_name":
				return this.lastName;
			case "email":
				return this.emailAdd;
			case "occupation":
				return this.occupation;
			case "password":
				return this.password;
			case "accepted_terms":
				return this.acceptTerms;
			default:
				throw new Exception("Unknown field name");
		}
	}
	
	public TestObject getInputRequiredErrorTestObject(String fieldName) {
		switch (fieldName) {
			case "first_name":
				return this.firstNameRequiredError;
			case "last_name":
				return this.lastNameRequiredError;
			case "email":
				return this.emailAddRequiredError;
			case "occupation":
				return this.occupationRequiredError;
			case "password":
				return this.passwordRequiredError;
			case "accepted_terms":
				return this.acceptTermsRequiredError;
			default:
				throw new Exception("Unknown field name");
		}
	}

	public TestObject getInputInvalidErrorTestObject(String fieldName) {
		switch (fieldName) {
			case "first_name":
				return this.firstNameInvalidError;
			case "last_name":
				return this.lastNameInvalidError;
			case "email":
				return this.emailAddInvalidError;
			case "accepted_terms":
				return this.acceptTermsRequiredError;
			default:
				throw new Exception("Unknown field name");
		}
	}
	/**
	 * @return the firstName
	 */
	public TestObject getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(TestObject firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public TestObject getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(TestObject lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailAdd
	 */
	public TestObject getEmailAdd() {
		return emailAdd;
	}

	/**
	 * @param emailAdd the emailAdd to set
	 */
	public void setEmailAdd(TestObject emailAdd) {
		this.emailAdd = emailAdd;
	}

	/**
	 * @return the occupation
	 */
	public TestObject getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(TestObject occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the password
	 */
	public TestObject getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(TestObject password) {
		this.password = password;
	}

	/**
	 * @return the acceptTerms
	 */
	public TestObject getAcceptTerms() {
		return acceptTerms;
	}

	/**
	 * @param acceptTerms the acceptTerms to set
	 */
	public void setAcceptTerms(TestObject acceptTerms) {
		this.acceptTerms = acceptTerms;
	}

	/**
	 * @return the signupButton
	 */
	public TestObject getSignupButton() {
		return signupButton;
	}

	/**
	 * @param signupButton the signupButton to set
	 */
	public void setSignupButton(TestObject signupButton) {
		this.signupButton = signupButton;
	}
}
