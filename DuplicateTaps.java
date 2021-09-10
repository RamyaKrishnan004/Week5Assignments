package week5.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateTaps extends BaseClass {
	@Test
	public void Duplicatelead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.id("ext-gen282")).sendKeys("mail");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		System.out.println("Title is : "+driver.getTitle());
		driver.findElement(By.className("smallSubmit")).click();
		}
		
	}




