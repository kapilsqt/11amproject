package day1testng;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Openpage {	
	WebDriver driver;	
	@Test(priority = 1 , description = "open web page")
	void Open_URL()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority = 2 , enabled = false)
	void Condition()
	{
		WebElement we=	driver.findElement(By.xpath("//span[contains(text(),'Returns')]"));
		String value = we.getText();
		System.out.println(value);
		if(value.equals("Returns"))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}	
	@AfterTest
	void Close()
	{
		driver.close();
		driver.quit();
	}
}
