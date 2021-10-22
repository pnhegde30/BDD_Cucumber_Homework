package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import page.TestBase;




public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	
	@Before
	public void  beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() throws Throwable {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		loginPage.enterUserName(username);
		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginPage.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBiiling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(3000);
		takeScreenshot(driver); //takes a screenshot
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
