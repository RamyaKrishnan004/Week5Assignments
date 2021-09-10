package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssignmentIncident extends ServiceBase{

		@Test
		public void AssignIncident() throws InterruptedException {
			driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).click();
			driver.findElement(By.xpath("(//button[@id='lookup.incident.assignment_group']")).click();
			Set<String> wH = driver.getWindowHandles();
			List<String> wH1 = new ArrayList<String>(wH);
			driver.switchTo().window(wH1.get(1));
			WebElement grp = driver.findElement(By.xpath("(//input[@class='form-control'])"));
			grp.sendKeys("Software");
			grp.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//a[text()='Software']")).click();
			driver.switchTo().window(wH1.get(0));
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.findElement(By.id("activity-stream-textarea")).sendKeys("Assigned");
			driver.findElement(By.xpath("(//button[text()='Update'])[1]")).click();
			WebElement out = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
			Select drpdown = new Select(out);
			drpdown.selectByVisibleText("text");			
			WebElement r = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
			r.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).click();
			WebElement rt = driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']"));
			String str = rt.getAttribute("value");
			if (str.contains("Software")) {
				System.out.println(" Software group");	
			}
		}

	}

