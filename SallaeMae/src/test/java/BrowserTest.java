import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salliemae.com/login/");
		Thread.sleep(3000);
		driver.manage();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='UserID']"));
		Username.sendKeys("Karima");
		
		
		
	}

}
