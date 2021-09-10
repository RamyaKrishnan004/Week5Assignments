package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ServiceBase {
	public ChromeDriver driver;
	
	@BeforeMethod
		public void preCondition() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev113028.service-now.com");
		//driver.get("https:dev86082.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Ramya@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		WebElement fil = driver.findElement(By.id("filter"));
		fil.sendKeys("Incident");
		fil.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@AfterMethod
		public void postCondition() {
		driver.close();
	}
}


