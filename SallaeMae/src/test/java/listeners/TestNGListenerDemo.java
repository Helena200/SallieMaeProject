package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestNGListenerDemo {
	@Test
	public void Test1() {
		System.out.println("I am inside Test 1");
	}
	@Test
	public void Test2() throws InterruptedException {
		System.out.println("I am inside Test 2");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salliemae.com/login/");
		Thread.sleep(3000);
		driver.manage();
		WebElement Username = driver.findElement(By.xpath("//input[@id='UserID']"));
		Username.sendKeys("Karima");
		

}
	@Test
	public void Test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}
}

