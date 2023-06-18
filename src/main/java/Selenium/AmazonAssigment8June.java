package Selenium;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 
 * Selenium Assignemnt - 08/06/2023	

Amazon

1.Load the URL https://www.amazon.in/
2.search as oneplus 9 pro
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Click the first text link of the first image
6. Take a screen shot of the product displayed
7. Click 'Add to Cart' button
8. Get the cart subtotal and verify if it is correct.
9.close the browser
*/
public class AmazonAssigment8June {
	
	
	String URL = "https://www.amazon.in/";
	String name = "oneplus 9 pro";
	
	ChromeDriver driver;

	@Test
	public void createAssignee() throws InterruptedException, AWTException, IOException {
		
		//4.9.1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		1. Load the URL https://www.amazon.in/	
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		2.search as oneplus 9 pro
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		wait.until(ExpectedConditions.elementToBeClickable(search)).click();
		search.sendKeys(name);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
//		3.Get the price of the first product
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//div[@data-cel-widget='MAIN-SEARCH_RESULTS-3']//span[@class='a-price-whole']")).getText();
	    System.out.println("the price of the first product  : " +price);
//		4. Print the number of customer ratings for the first displayed product
	    Thread.sleep(2000);
		String ratings = driver.findElement(By.xpath("//div[@data-cel-widget='MAIN-SEARCH_RESULTS-3']//a[contains(@href, 'Reviews')]/span")).getText();
	    System.out.println("the ratings of the first product  : " +ratings);
//		5. Click the first text link of the first image
	    driver.findElement(By.xpath("(//div[@data-cel-widget='MAIN-SEARCH_RESULTS-3']//a[contains(@href, 'oneplus')])[1]")).click();
	    ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
//		6. Take a screen shot of the product displayed
	      Thread.sleep(2000);
	      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("./AmazonAssignmentimage.png"));
//		7. Click 'Add to Cart' button
	        driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @type='button']")).click();
//		8. Get the cart subtotal and verify if it is correct.
	        Thread.sleep(5000);
//	        WebElement frame = driver.findElement(By.xpath("(//div[@id='attach-desktop-sideSheet']"));
//		    driver.switchTo().frame(frame);
		    String subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText().substring(1, 7);
		    System.out.println("The subtotal   : " +subtotal);
		    assertEquals("The Price and Subtotal at checkout are same", price, subtotal);
//	    9.close the browser
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
