package generatereport;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Getreport {	
	
	public static void main(String[] args) {		
		ExtentReports e_report;
		ExtentTest e_test;
		
		e_report = new ExtentReports("E:\\Workspace\\11amWeekend\\src\\report\\First.html");
		e_test = e_report.startTest("Demo");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			e_test.log(LogStatus.PASS, "Test case pass");
		}
		else
		{
			e_test.log(LogStatus.FAIL, "Test case fail");
		}
		e_report.endTest(e_test);
		e_report.flush();		
	}
}
