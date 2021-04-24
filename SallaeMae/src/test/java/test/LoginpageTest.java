package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginpageObjects;

public class LoginpageTest {
	private static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		loginpagetest();
		
	}
	public static void loginpagetest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 LoginpageObjects loginpageobj= new LoginpageObjects(driver);
		 driver.get("https://www.salliemae.com/login/");
		 loginpageobj.loginbutton();
		 loginpageobj.passwordbutton("abc");
		 loginpageobj.usernamebutton("123");
		 loginpageobj.creatingnewaccountbutton();
		 Thread.sleep(3000);
		 
	}
	

}
