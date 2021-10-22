package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends LoginPage {

	public NewAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//Element Library 
	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[10]/a/span[1]")
	WebElement BankAndCash;
	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[10]/ul/li[1]/a")
	WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AddAccount; 
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement Balance; 
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement ContactPhone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmtiButtonBanking;
	
	public void clickBankAndCash() {
		BankAndCash.click();
	}
	
	public void clickNewAccount() {
		NewAccount.click();
	}
	
	public void AddAcccount (String account) {
		AddAccount.sendKeys(account);
	}
	
	public void AddDescription (String description) {
		Description.sendKeys(description);
	}
	
	public void AddInitialBalance (String IB) {
		Balance.sendKeys(IB);
	}
	
	public void AddAccountNumber (String AN) {
		AccountNumber.sendKeys(AN);
	}
	
	public void AddContactPerson (String person) {
		ContactPerson.sendKeys(person);
	}
	
	public void AddContactPhone (String phone) {
		ContactPhone.sendKeys(phone);
	}
	
	public void AddInternetBankingURL (String url) {
		InternetBankingURL.sendKeys(url);
	}
	
	public void clickSubmitNewAccountButton () {
		SubmtiButtonBanking.click();
	}
}
