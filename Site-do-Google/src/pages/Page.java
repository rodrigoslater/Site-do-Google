package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Page {
	WebDriver driver;
	 By pesquisa = By.name("q");
	By btnPesquisar = By.name("btnK");
	By titleText =By.className("LC20lb");
	By login = By.name("btnLogin");
	By title =By.className("homepage push");
	
	
	 public Page(WebDriver driver){
	        this.driver = driver;
}
	
	 public  Page digitar(String strUserName) {
		WebElement searchBox = driver.findElement(pesquisa);
		searchBox.sendKeys(strUserName);
		searchBox.submit();
		return new Page(driver);
	   }
	 
	 public  Page click()   {
		  driver.findElement(titleText).click();
		 return new Page(driver);
	   }
	 
     public String getTitle(){
    	 System.out.println(driver.getTitle());
         return driver.getTitle();

        }
     public  Page search(String name) throws InterruptedException   {
	      
		this.digitar(name);
	 	this.click(); 
	 	return new Page(driver);
	   }
    
     

}
