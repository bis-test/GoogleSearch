package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleSearchTest extends BaseTest{
	
	@Test
	public void executeGoogleSearchTest()
	{
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("titanic film wikipedia");
		search.sendKeys(Keys.ENTER);
		
		WebElement serResult = driver.findElement(By.xpath("(//div[@class='ellip'])[1]"));
		serResult.click();
		
		String expTitle="Titanic (1997 film) - Wikipedia";
		String actTitle= driver.getTitle();
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title verification Passed");
		}
		else
		{
			System.out.println("Title verification Failed");
		}
		
	}
	
	

}
