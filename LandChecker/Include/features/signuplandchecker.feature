@invalid_signup
Feature: Invalid SignUp

Background:
	Given I am in landchecker signup page
	When the required fields are empty
 
   Scenario Outline: Signup with invalid character in the firstname,lastname
  	And I input <firstname> in the first_name field
  	And I input <lastname> in the last_name field
  	Then I should see Must be valid characters in the first_name field
  	And I should see Must be valid characters in the last_name field
  	
  	Examples:
  		|firstname| lastname |
  		| !@ | %$@ |
  		| 34343 | 888393 |
  		| ew0sw | L@st |
  	
  Scenario Outline: Signup with invalid email address
  	And I input <email> in the email field
  	Then I should see Invalid email address in the email field
  	Examples:
  	| email |
  	|plainaddress |
  	|&*&*&*.com |
  	|@domain.com |
  	|Jose Smith<email@domain.com>|
  	|email.domain.com|
  	|email@192.168.1.334|
  	|email@domain..com|
  	|email@domain|
  	
  	
  	
  Scenario Outline: Signup with invalid character count in the firstname and lastname field
  	And I input <single_character> in the first_name field
  	And I input <single_character> in the last_name field
  	Then I should see <error_message> in the first_name field
  	And I should see <error_message> in the last_name field
  	
  	Examples:
  	|single_character|error_message|
  	|a|Must be more than 2 valid characters|
  	|1|Must be more than 2 valid characters| 
  		
  Scenario: Signup when All fields are empty
    And I click on Signup button
    Then I should see First Name is required in the first_name field
    And I should see Last Name is required in the last_name field
    And I should see Email is required in the email field
    And I should see Password is required in the password field
    And I should see Occupation is required in the occupation field
    And I should see Terms of Use must be accepted displayed under the Terms Of Use checkbox
  	
  