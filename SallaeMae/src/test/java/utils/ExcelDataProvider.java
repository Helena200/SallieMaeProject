package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver= null;

	@BeforeTest
	public void setupTest() {
	 String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
	}



	
	
	
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password){
		
		
		System.out.println(username+" "+password);
		driver.get("https://www.salliemae.com/login/");
			driver.findElement(By.id("UserID")).sendKeys(username);
			driver.findElement(By.name("Password")).sendKeys(password);
		driver.manage();
	
		
		
	}
	@DataProvider(name="test1data")
	public Object[][] getdata() {
		String excelPath="C:\\Users\\karim\\eclipse-workspace\\selinuim\\SallaeMae\\excel\\data.xlsx";
		testData(excelPath,"sheet1");
	Object data[][]=testData(excelPath,"Sheet1");
	return data;
	}
	public static   Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=1; i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+"");
			}
			//System.out.println();
		}
		return data;
	}
}
