package testNG_Parallel;

import com.page.objects.FbLoginPage;
import com.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLoginStepDef extends BaseClass{
	FbLoginPage fbElements;
	@Given("User opens the browser")
	public void launchBrowser() {
		openBrowser("chrome");
		fbElements=new FbLoginPage(getDriver());
	}
	@Given("User opens facebook page")
	public void goToFbLoginPage() {
		loadUrl("https://www.facebook.com/");
	}
	@When("User enters {string} in username input field")
	public void user_enters_in_username_input_field(String string) {
	    sendText(fbElements.getUsernameInputField(), string);
	}
	@When("User enters {string} in password input field")
	public void user_enters_in_password_input_field(String string) {
	    sendText(fbElements.getPasswordInputField(), string);
	}
	@When("User click the login button")
	public void loginButtonClick() {
		click(fbElements.getLoginButton());
	}
	@Then("User directed to their homepage")
	public void verifyHomePage() {
		pageLoadTimeout();
		if(getPageTitle().equals("Facebook")) {
			System.out.println("Expected result of the scenario is achieved.");
		}else {
			System.out.println("Check the given credentials.");
		}
	}
	@Then("User closes the browser")
	public void tearDown() {
		closeBrowser();
	}
	@When("User enters {string} username input field")
	public void userEntersUsernameInputField(String string) {
	    sendText(fbElements.getUsernameInputField(), string);
	}
	@When("User enters {string} password input field")
	public void userEntersPasswordInputField(String string) {
	    sendText(fbElements.getPasswordInputField(), string);
	}

}
