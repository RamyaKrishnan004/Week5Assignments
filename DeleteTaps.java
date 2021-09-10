package week5.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteTaps extends BaseClass {
	@Test
	public void Deletelead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.id("ext-gen270")).sendKeys("456321");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(2000);
		WebElement id = driver.findElement(By.xpath("//*[@id=\"ext-gen41\"]"));
		String rt = id.getText();
		id.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen246")).sendKeys(rt);
		driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
		//*[@id="ext-gen334"]
		WebElement check = driver.findElement(By.xpath("//*[@id=\"ext-gen437\"]"));
		//*[@id="ext-gen437"]
		if (check.isDisplayed() == true) {
			System.out.println("Records not found");
		}
		
	}
}


