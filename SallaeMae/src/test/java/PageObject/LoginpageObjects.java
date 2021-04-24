package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginpageObjects {
	WebDriver driver=null;
	By username= By.name("UserID");
	By password= By.id("Password");
	By login= By.xpath("//body/main[@id='main']/section[1]/row[1]/column[1]/form[1]/div[2]/p[1]/a[1]");
	By createonlineaccount = By.xpath("//a[contains(text(),'Create your online account')]");
	public LoginpageObjects(WebDriver driver) {
		this.driver=driver;
	}
	public void loginbutton() {
		driver.findElement(login).click();
	}
	public void passwordbutton(String text) {
		driver.findElement(password).sendKeys(text);
	}
	public void usernamebutton(String text) {
		driver.findElement(username).sendKeys(text);
	}
	public void creatingnewaccountbutton() {
		driver.findElement(createonlineaccount).click();
	}

}
