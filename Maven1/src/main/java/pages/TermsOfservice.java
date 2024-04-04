package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsOfservice {


		@FindBy (xpath ="//a[text()='Meta Products']")
		private WebElement metaProducts;
		
		@FindBy (xpath="//a[text()='Products']")
		private WebElement products;
		
	    public TermsOfservice(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		}
		 
		public void clickOnMetaProducts() {
			metaProducts.click();
		}
		public void clickOnProducts() {
			products.click();
		}
		
	

}
