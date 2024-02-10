@openQA
Feature: OpenQA
	Scenario: OpenQA Registration
		Given User opens browser
		And User go to openQA registration page
		When User enter firstname and lastname
		And User enter email address
		And User chooses gender
		And User enter mobile number
		And User enter date of birth
		And User enters subjects
		And User chooses hobbies
		And User uploads picture
		And User enter communication address
		Then User select state
		And User select city
		And User click submit button
		And User closes the browser