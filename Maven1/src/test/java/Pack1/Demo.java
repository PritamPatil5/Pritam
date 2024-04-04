package Pack1;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginPage;
import pages.TermsOfservice;
import pages.TermsPage;
import pages.TermsService;

public class Demo {

 public static void main(String[] args) throws InterruptedException
 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Rinuuu\\selenium file\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		LoginPage loginPage= new LoginPage(driver);
		loginPage.clickTerms();
		
		TermsPage termsPage= new TermsPage(driver);
		termsPage.clickOnTermsService();
		Thread.sleep(2000);
		
		TermsOfservice termsOfService= new TermsOfservice(driver);
		termsOfService.clickOnProducts();
		
		System.out.println(driver.getCurrentUrl());		
		
		
		
		
		
	
		
	}
}
