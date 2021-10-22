package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.LoginPage;
import page.NewAccountPage;
import page.TestBase;

public class NewAccountStepDefinition extends TestBase {
	
LoginPage loginPage;
NewAccountPage newAccountDetails;
	
	@Before
	public void  beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given("^User is on the techfios login page$")
	public void user_is_on_the_Techfios_login_page() throws Throwable {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$" )
	public void user_enters_username_as(String username, String password) throws Throwable {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}

//	@When("^User enters password as \"([^\"]*)\"$")
//	public void user_enters_password_as(String password) throws Throwable {
//		loginPage.enterPassword(password);
//		Thread.sleep(3000);
//	}

	@When("^User clicks on the signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginPage.clickSignInButton();
	}

//	@Then("^User should land on dashboard page$")
//	public void user_should_land_on_dashboard_page() throws Throwable {
//		String expectedTitle = "Dashboard- iBiiling";
//		String actualTitle = loginPage.getPageTitle();
//		Assert.assertEquals(expectedTitle, actualTitle);
//		Thread.sleep(3000);
//	}
	
	@Then("^User clicks on Bank & Cash button$")
	public void user_clicks_on_bank_and_cash_button() throws Throwable {
		newAccountDetails.clickBankAndCash();
		Thread.sleep(3000);
	}
	
	@Then("^User clicks on New Account$")
	public void user_clicks_on_new_account() throws Throwable {
		newAccountDetails.clickNewAccount();
		Thread.sleep(3000);
	}
	
	@Then("^User fills up the information by entering \"<accountTitle>\" and \"<description>\" and \"<initialBalance>\" and \"<accountNumber>\" and \"<contactPerson>\" and \"<phone>\" and \"<internetBankingURL>\"$")
	public void user_fills_out_information(String accountTitle, String description, String initialBalance, String accountNumber, String contactPerson, String phone, String internetBankingURL) throws Throwable {
		newAccountDetails.AddAcccount(accountTitle);
		newAccountDetails.AddDescription(description);
		newAccountDetails.AddInitialBalance(initialBalance);
		newAccountDetails.AddAccountNumber(accountNumber);
		newAccountDetails.AddContactPerson(contactPerson);
		newAccountDetails.AddContactPhone(phone);
		newAccountDetails.AddInternetBankingURL(internetBankingURL);
		Thread.sleep(3000);
	}
	
	@Then("^User will click on the submit button$")
	public void user_clicks_on_submit_button() {
		newAccountDetails.clickSubmitNewAccountButton();
	}
	
	
	
}
	
