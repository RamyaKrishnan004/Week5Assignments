package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IncidentCreate extends ServiceBase  {
		@Test
		public  void createIncident() throws InterruptedException {
			
			driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
			driver.switchTo().frame("gsft_main");
			Set<String> wH1 = driver.getWindowHandles();
			List<String> wH2=new ArrayList<String>(wH1);
			driver.switchTo().window(wH2.get(1));
			driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
			driver.switchTo().window(wH2.get(0));
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			String str1= driver.findElement(By.xpath("(//input[@name='incident.number'])"))
					.getAttribute("value");
			System.out.println("str1 is : ");
			driver.findElement(By.id("incident.short_description")).sendKeys("Automation Testing");
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			Thread.sleep(2000);
			WebElement rt = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
			Select drpdown=new Select(rt);
			drpdown.selectByVisibleText("text");
			WebElement wb = driver.findElementByXPath("(//input[@class='form-control'])[1]");
			wb.sendKeys(str1);
			wb.sendKeys(Keys.ENTER);
			String str = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).getText();
			if(str.equals(str1)) {
				System.out.println("CreateIncident");
			}

		}

	}


