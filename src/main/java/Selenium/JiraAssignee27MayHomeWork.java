package Selenium;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.commons.codec.binary.Base64;


/*Create a JIRA Account - for team3
LOGIN to JIRA
create an issue in JIRA

Assignee should be randomised

hint - RandomStrings();


//3.1.149 - use syste.setproperty for this version of selenium
//4.9.1 - use webdriver.manage.chromdriver();
Script should handle both sel versions*/

public class JiraAssignee27MayHomeWork {
	//changed credentials for gitversion
	String email = "SDDDSD";
	String passKey = "DSDSDSDS";
	byte[] encodedPass = Base64.encodeBase64(passKey.getBytes());
	byte[] decodedPass = Base64.decodeBase64(encodedPass);
	String newpass = new String(decodedPass);
	String jiraURL = "https://SDSDSDSD.atlassian.net/jira/software/projects/SDET/boards/1/backlog";
	String[] assignee = {"Abilash","D Sivananda","Eswaran Anantha Raman","hemaabinaya18","Shilviyajayaraj", "Shilviya Jayaraj", "subash prasad"};
	Random randomgenerator = new Random();
    int randomNum = randomgenerator.nextInt(assignee.length);
	String randomAssign = assignee[randomNum];
	ChromeDriver driver;
	@Test
	public void createAssignee() throws InterruptedException {
		
//		3.141.59
		System.setProperty("webdriver.chrome.driver",
				"E:\\SDET_PRE\\Drivers Path\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//4.9.1
//		WebDriverManager.chromedriver().setup();
		
	
		driver.get(jiraURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username' and @type='email']")).sendKeys(email);
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//button[@id='login-submit']"));
		login.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys(newpass);
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='createGlobalItem']"))).click();
	    driver.findElement(By.id("summary-field")).click();
	    driver.findElement(By.id("summary-field")).sendKeys("Sample - created By Siva for Automation Hands ON ");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='assignee-field-label']")));
	    driver.findElement(By.xpath("//span[contains(text(), 'Automatic')]/parent::div")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(  "//span[text()='"+randomAssign+"']")).click();
	    System.out.println(randomAssign);
	    Thread.sleep(1000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'Sprint')]")));
	    driver.findElement(By.xpath("//div[contains(text(), 'Select sprint')]")).click();
	    driver.findElement(By.xpath("//div[contains(@data-test-id, 'customfield_10020')]//div[contains(text(), 'Sprint 1')]")).click();
	    Thread.sleep(1000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
	   
	}
}
