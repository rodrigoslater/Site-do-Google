package teste;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Acess;
import pages.Page;

public class Teste {
	static ChromeDriver driver;
	Acess acesso;
	Page page;

	 @Before
	 public void before() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver = new ChromeDriver(); 
	 }
	 @AfterClass
	 public static void tearDowProjeto_PesquisanTest(){
	     driver.quit();
	 }
	 
	 
	 
	@Test
	public void testGoogleSearch() throws InterruptedException {
		 acesso=new Acess(driver);
		 page=new Page(driver);
		 acesso.acesso("http://www.google.com");
		 page.search("seleniumhq.org");
		 String titulo = page.getTitle();
		 Assert.assertEquals(titulo, "Selenium - Web Browser Automation");
		 
		
		

	}
}