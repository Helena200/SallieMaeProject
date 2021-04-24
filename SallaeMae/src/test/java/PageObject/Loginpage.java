package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	private static WebElement element= null;
	public static WebElement username(WebDriver driver) {
		 element = driver.findElement(By.id("UserID"));
		return element;
		
	
		
	}
	public static WebElement password(WebDriver driver) {
		element= driver.findElement(By.name("Password"));
		return element;

}
	public static WebElement Createyouronlineaccountbutton(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[contains(text(),'Create your online account')]"));
		return element;
		
	}
	}

