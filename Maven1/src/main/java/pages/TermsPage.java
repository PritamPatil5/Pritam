package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsPage {
	

		
		@FindBy (xpath ="//h4[text()='Terms of Service']") 
		private WebElement termsOfService;
		
		@FindBy (xpath="//h4[text()='Privacy Policy']")
		private WebElement privacyPolicy;
		
		@FindBy (xpath="//h4[text()='Community Standards']")
		private WebElement communityStandars;
		
		
        public TermsPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		}
		 
		public void clickOnTermsService() {
			termsOfService.click();
		}
		public void clickOnPrivacyPolicy() {
			privacyPolicy.click();
		}
		public void clickOnCommunityStandars() {
			communityStandars.click();
		}
	}

		


