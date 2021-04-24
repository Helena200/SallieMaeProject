package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import PageObject.LoginpageObjects;

public class DemoTestng {
	 WebDriver driver= null;
	 @BeforeTest
	public void setupTest() {
		 String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		


	
	
	}
	 @Test
	public void loginpage(){
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
