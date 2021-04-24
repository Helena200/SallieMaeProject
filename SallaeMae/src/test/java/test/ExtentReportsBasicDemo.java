package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {
	 private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);
		
ExtentTest test1 = extent.createTest("Username Test One");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\Drivers\\chromedriver.exe");
test1.log(Status.INFO, "Starting Test Case");
driver=new ChromeDriver();
driver.get("https://www.salliemae.com/login/");
test1.pass("navigate to salliemae.com");
driver.findElement(By.id("UserID")).sendKeys("Automation");
test1.pass("Entered text in UsernameButton");
driver.findElement(By.name("Password")).sendKeys("karima");
test1.pass("Entered text in PasswordButton");
Thread.sleep(3000);
test1.pass("closed the browser");
test1.info("Test Completed");
extent.flush();
	}

}
