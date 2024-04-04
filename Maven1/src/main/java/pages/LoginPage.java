package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath ="//input[@id='email']") 
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy (xpath="//button[text()='Log in'")
	private WebElement Login;
	
	@FindBy (xpath="//a[text()='Terms']")
	private WebElement Terms;
	
	
	public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	}
	 
	public void sendUserName() {
		userName.sendKeys("Pritam");
	}
	public void sendPassword() {
		passWord.sendKeys("1234");
	}
	public void clicklLogin() {
		Login.click();
	}
	public void clickTerms() {
		Terms.click();
	}
}
	
	
	
