package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import PageObject.LoginpageObjects;

public class DemoTestng2 {
	 WebDriver driver= null;
	 @BeforeTest
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		


	
	
	}
	 @Test
	public void loginpage1(){
	driver.get("https://www.salliemae.com/login/");
	
	Loginpage.password(driver).sendKeys("Youcef");
    
	//driver.findElement(By.name("Password")).sendKeys("sahli");
	//driver.findElement(By.linkText("Log in")).click();
	
	Loginpage.username(driver).sendKeys("sahli");
	Loginpage.Createyouronlineaccountbutton(driver).click();
	

}
	 @Test
		public void loginpage2(){
		driver.get("https://www.salliemae.com/login/");
		
		Loginpage.password(driver).sendKeys("Youcef");
	    
		//driver.findElement(By.name("Password")).sendKeys("sahli");
		//driver.findElement(By.linkText("Log in")).click();
		
		Loginpage.username(driver).sendKeys("sahli");
		Loginpage.Createyouronlineaccountbutton(driver).click();
	 }
	 @AfterTest
	public void teardownTest() throws InterruptedException {
		driver.manage();
	    Thread.sleep(3000);
		System.out.println("this is complet");
		
	}

}
