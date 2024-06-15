package sel_day1;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenPage {
	
	public static void main(String[] args) throws InterruptedException {		
		
		//chrome browser 
		FirefoxDriver driver = new FirefoxDriver();
		
		//load url
		driver.get("https://www.google.com/");
		
		//page maxi 
		driver.manage().window().maximize();
		
		//time 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		Thread.sleep(3000);
		
		//close web page
		driver.close();
		
	}

}
