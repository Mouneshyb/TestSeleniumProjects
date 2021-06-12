package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage {

	WebDriver driver;
	By homePageUserName = By.xpath("//h2[.='Guru99 Bank']");
	
	public Guru99HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Testing
	
	//Get the User name from Home Page
		public String getHomePageDashboardUserName(){
		 return	driver.findElement(homePageUserName).getText();
		}
}
