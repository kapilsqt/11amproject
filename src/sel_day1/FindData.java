package sel_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindData {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");		
		driver.manage().window().maximize();		
		Thread.sleep(3000);
		
		String title = driver.getTitle();		
		System.out.println(title);		
		
		String Url = driver.getCurrentUrl();		
		System.out.println(Url);
		
		String Handle = driver.getWindowHandle();		
		System.out.println(Handle);
		
		boolean code = driver.getPageSource().contains("Google Search");
		System.out.println(code);
		
	}

}
