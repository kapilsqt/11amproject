package testngday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testapp {	
	WebDriver driver;		
	@Parameters({"url"})
	@Test
	void OpenUrl(String url)
	{
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
	@Test
	void GetTitle()
	{
		System.out.println(driver.getTitle());
	}
	@Test
	void Loginpage()
	{
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}
}
