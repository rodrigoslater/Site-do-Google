package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acess {
	 WebDriver driver;
	


 public Acess(WebDriver driver){
		        this.driver = driver;
	}
		    
			  
public Page acesso(String url) {

	
	 driver.get(url);
	 return new Page(driver);
		  
}

		    





}
