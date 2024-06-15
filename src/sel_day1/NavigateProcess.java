package sel_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateProcess {
	
	public static void main(String[] args) throws InterruptedException {		
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}

}

//navigate() : to() , back() , forward() , refresh()
