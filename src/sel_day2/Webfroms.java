package sel_day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webfroms {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("my-text-id")).sendKeys("ABC");
		driver.findElement(By.name("my-password")).sendKeys("ABC123");	
		driver.findElement(By.linkText("Return to index")).click();
		driver.navigate().back();
		Select sel  = new Select(driver.findElement(By.name("my-select")));
		sel.selectByVisibleText("One");
		driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\CROMA CAMPUS\\Desktop\\Kapil_manchandani.docx");
		driver.findElement(By.id("my-check-1")).click();		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File f = 	screenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\CROMA CAMPUS\\Desktop\\SS\\image.png"));
	
	}

}
