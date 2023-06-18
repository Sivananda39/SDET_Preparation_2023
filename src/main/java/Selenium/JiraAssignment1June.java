package Selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 
 * Selenium Assignemnt - 01/06/2023	
	
	Edit Lead
1. Launch URL
"http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on Create Lead
7. Enter CompanyName Field Using id Locator
8. Enter FirstName Field Using id Locator
9. Enter LastName Field Using id Locator
10. Enter FirstName(Local) Field Using id Locator
11. Enter Department Field Using any Locator of Your
Choice
12. Enter Description Field Using any Locator of your
choice
13. Enter your email in the E-mail address Field using
the locator of your choice
14. Select State/Province as NewYork Using Visible Text
15. Click on Create Button
16. Click on edit button
17. Clear the Description Field using .clear()
18. Fill ImportantNote Field with Any text
19. Click on update button
20. Validate the Title of Resulting Page
Username: demosalesmanager
Password: crmsfa
*/
public class JiraAssignment1June {
	//ChangedCredentials for GIT
	String username = "demosalesmanager";
	String password = "crmsfa";
	byte[] encodedPass = Base64.encodeBase64(password.getBytes());
	byte[] decodedPass = Base64.decodeBase64(encodedPass);
	String newpass = new String(decodedPass);
	String testLeafURL = "http://leaftaps.com/opentaps/control/login";
	
	ChromeDriver driver;

	@Test
	public void createAssignee() throws InterruptedException, AWTException {
		
		//4.9.1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		1. Launch URL
		
		driver.get(testLeafURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(newpass);
//		3. Click on Login Button using Class Locator
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		Thread.sleep(1000);
//		4. Click on CRM/SFA Link
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='crmsfa']/a"))).click();
		Thread.sleep(1000);
//		5. Click on Leads Button
		driver.findElement(By.xpath("//a[contains(@href, 'leads' ) or contains(text(), 'Leads')]")).click();
		Thread.sleep(1000);
//		6. Click on Create Lead
		driver.findElement(By.xpath("//a[contains(@href, 'createLead' ) or contains(text(), 'Create Lead')]")).click();
//		Thread.sleep(1000);
//		7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("sivaSeleniumAssessment");
//		8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Siva");
//		9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nanda");
//		10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DSN");
//		11. Enter Department Field Using any Locator of Your
//		Choice
		driver.findElement(By.name("departmentName")).sendKeys("Assign");
//		12. Enter Description Field Using any Locator of your
//		choice
		driver.findElement(By.name("description")).sendKeys("Selenium Assignment for June 1st - by Siva");
//		13. Enter your email in the E-mail address Field using
//		the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sample@sample.com");
//		14. Select State/Province as NewYork Using Visible Text
		Select stateProv = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateProv.selectByVisibleText("New York");
//		15. Click on Create Button
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Create Lead']")).click();
		Thread.sleep(5000);
//		16. Click on edit button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Edit']"))).click();
		Thread.sleep(2000);
//		17. Clear the Description Field using .clear()
		driver.findElement(By.name("description")).clear();
//		18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note for automation - siva");
//		19. Click on update button
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		Thread.sleep(5000);
//		20. Validate the Title of Resulting Page
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
