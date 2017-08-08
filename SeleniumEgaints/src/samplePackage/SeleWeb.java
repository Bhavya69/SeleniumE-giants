package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleWeb {

	
		public static void main(String[] args) throws InterruptedException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.google.com");
			WebElement link;
			link = driver.findElement(By.id("lst-ib"));
			link.click();
			Thread.sleep(5000);
			WebElement searchBox;
			searchBox = driver.findElement(By.id("searchInput"));
			searchBox.sendKeys("theegiants");
			searchBox.submit();
			Thread.sleep(5000);
			driver.quit();

	}

}
