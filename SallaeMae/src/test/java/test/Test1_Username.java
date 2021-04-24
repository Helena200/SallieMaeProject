package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.Loginpage;

public class Test1_Username {
	private static WebDriver driver =null;

	public static void main(String[] args)  {
		try {
			username();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void username() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.salliemae.com/login/");
		driver.manage();
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//input[@id='UserID']")).sendKeys("Helena");
	    Loginpage.password(driver).sendKeys("Youcef");
	    
		//driver.findElement(By.name("Password")).sendKeys("sahli");
		//driver.findElement(By.linkText("Log in")).click();
		
		Loginpage.username(driver).sendKeys("sahli");
		Loginpage.Createyouronlineaccountbutton(driver).click();
		System.out.println("this is complet");
	}

}
