package week5.day1assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditTaps extends BaseClass {
	@Test
	public void Editlead() throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen248")).sendKeys("ramya");
		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.xpath("//a[text()='ramya']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cts");
		driver.findElement(By.className("smallSubmit")).click();
			
	}
}


