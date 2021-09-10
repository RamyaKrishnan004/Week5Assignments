package week5.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateTaps extends BaseClass {
	@Test
	public  void Createlead() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ramya");
		driver.findElement(By.id("lastNameField")).sendKeys("krishnan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sweety");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ila");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("GoodNoon");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ramyank004@gmail.com");
		WebElement Drp = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select drpDwn1 = new Select(Drp);
		drpDwn1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Page title is : " + driver.getTitle());	
		
	}
}
