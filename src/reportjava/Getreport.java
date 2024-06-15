package reportjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Getreport {
	
	public static void main(String[] args) throws InterruptedException {
		String path = "E:\\Workspace\\11amWeekend\\src\\reportjava\\";
		
		ExtentReports extentReports = new ExtentReports(path + "Smoke.html");
		ExtentTest extentTest = extentReports.startTest("Demo");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String title  = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("test case pass");
			extentTest.log(LogStatus.PASS, "test case pass");
		}
		else 
		{
			System.out.println("test case fail");
			extentTest.log(LogStatus.PASS, "test case fail");
		}
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

}
