package Selenium;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * 
 * Selenium scenario assignment - Completion date - 31/05/2023:

Browser: Firefox, and Edge

1. Login to JIRA with Private/In Private mode.
2. Click on project and select your project
3. From the board move any issue from one status to other using drag and drop
4. Click on any Task
5. click on 'add a child issue' and create a sub task
6. Go to that sub task and do below actions
        a. add Description
        b. add assignee from your team
        c. add a label 
        d. add a comment
        e. click on add and validate the comment
7. Go to JIRA board and validate the sub task
8. Navigate to the Sub Task and add a attachment, and validate the same.
9. Delete the Parent task
10. Validate in JIRA board as Parent and Sub Task has been move out of board
*/
public class JiraAssignement29May {
	//ChangedCredentials for GIT
	String email = "shiva39nand@gmail.com";
	String passKey = "Artemis@239";
	byte[] encodedPass = Base64.encodeBase64(passKey.getBytes());
	byte[] decodedPass = Base64.decodeBase64(encodedPass);
	String newpass = new String(decodedPass);
	String jiraURL = "https://sivasdetteam3.atlassian.net/jira/software/projects/SDET/boards/1/backlog";
	String[] assignee = {"Abilash","D Sivananda","Eswaran Anantha Raman","hemaabinaya18","Shilviyajayaraj", "Shilviya Jayaraj", "subash prasad"};
	Random randomgenerator = new Random();
    int randomNum = randomgenerator.nextInt(assignee.length);
	String randomAssign = assignee[randomNum];
	String childIssue = "ChildIssue Created - Siva";
	String comment = "comment for test by siva";

	
	@Test
	public void createAssignee() throws InterruptedException, AWTException {
		//For Firefox
//        FirefoxOptions option = new FirefoxOptions();
//		option.addArguments("incognito");
		
		//4.9.1
//		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new ChromeDriver();
//		WebDriver driver = new EdgeDriver();

		
		//1. Login to JIRA with Private/In Private mode.
		driver.get(jiraURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username' and @type='email']")).sendKeys(email);
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//button[@id='login-submit']"));
		login.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys(passKey);
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
//		2.Click on project and select your project
		//Click on Projects
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']/span[contains(text(), 'Projects')]")));
	    driver.findElement(By.xpath("//button[@type='button']/span[contains(text(), 'Projects')]")).click();
	    //Click 'View All projects'
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'View all projects') and @data-item-title='true']")));
	    driver.findElement(By.xpath("//span[contains(text(), 'View all projects') and @data-item-title='true']")).click();
	    //Enter valid project Name
	    
	    driver.findElement(By.xpath("//input[@data-test-id='searchfield' and @name='search']")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@data-test-id='searchfield' and @name='search']")).sendKeys("SDETTeamThreePractice");
	    //Click the project
	    driver.findElement(By.xpath("//span[contains(text(), 'SDET')]")).isDisplayed();
	    driver.findElement(By.xpath("//span[contains(text(), 'SDET')]")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'SDET')]")));
	    String projName = driver.findElement(By.xpath("//h1[contains(text(), 'SDET')]")).getText();
	    System.out.println("The Valid Project name is : " + projName);
//		3. From the board move any issue from one status to other using drag and drop
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-rbd-draggable-id, 'COLUMN::4')]")));
	    //WebElement on which drag and drop operation needs to be performed
	    WebElement fromElement = driver.findElement(By.xpath("(//div[contains(@data-rbd-draggable-id, 'COLUMN::4')]//div[@data-rbd-draggable-context-id='1'])[1]"));
	    //WebElement to which the above object is dropped
	    WebElement toElement = driver.findElement(By.xpath("//div[contains(@data-rbd-draggable-id, 'COLUMN::5')]"));
	    Actions builder = new Actions(driver);
	    builder.dragAndDrop(fromElement, toElement);
	    System.out.println("droped a task to INprogrss Board : " );
	    
//	    4. Click on any Task
	    Thread.sleep(3000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-rbd-draggable-id, 'COLUMN::4')]//span[contains(., 'Sample - created By Siva for Automation Hands ON ')]"))).click();
	    Thread.sleep(3000);
	    
//	    5. click on 'add a child issue' and create a sub task
	    driver.findElement(By.xpath("//button[@aria-label='Add a child issue' and @type='button']")).isDisplayed();
	    driver.findElement(By.xpath("//button[@aria-label='Add a child issue' and @type='button']")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='childIssuesPanel' and contains(@placeholder, 'needs to be done?')]"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='childIssuesPanel' and contains(@placeholder, 'needs to be done?')]")).sendKeys(childIssue);
	    driver.findElement(By.xpath("//button[contains(@data-testid, 'add-child-trigger-button')]")).click();
	    Thread.sleep(5000);
//	    6. Go to that sub task and do below actions
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='issue-line-card.card-container']//a[contains(@href, 'SDET') and contains(@data-test-id, 'view.key')]"))).click();
//	            a. add Description
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//h2[text()='Description']")).isDisplayed();
	    driver.findElement(By.xpath("//button[@aria-label='Edit Description' and @type='button']")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@contenteditable='true' and @role='textbox']"))).click();
	    driver.findElement(By.xpath("//button[@data-testid='comment-save-button' and @type='button']")).click();
//	            b. add assignee from your team
	    driver.findElement(By.xpath("//span[text()='Unassigned']")).isDisplayed();
	    driver.findElement(By.xpath("//span[text()='"+randomAssign+"']")).click();
	    
//	            c. add a label 
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//h2[text()='Labels']")).isDisplayed();
	    driver.findElement(By.xpath("//button[@aria-label='None- edit Labels' and @type='button']")).click();
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='AddTask']"))).click();
	    
//	            d. add a comment
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder, 'Add a commen')]"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[contains(@placeholder, 'Add a commen')]")).sendKeys(comment);
	    driver.findElement(By.xpath("//button[@data-testid='comment-save-button' and @type='button']")).click();
	    
//	            e. click on add and validate the comment
	    
	    
	    String validateComment =  driver.findElement(By.xpath("//div[contains(@class, 'ak-renderer-document')]/p")).getText();
	    System.out.println("The comment updated in JIRA: " + validateComment);
	    assertEquals(comment, validateComment);
	    
//	    7. Go to JIRA board and validate the sub task
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@data-test-id, 'gen-board')]"))).click();
	    Thread.sleep(3000);
	    
//	    8. Navigate to the Sub Task and add a attachment, and validate the same.
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@aria-label, '0 of 1 child issues complete')]"))).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[@aria-label='Attach' and @type='button']")).isDisplayed();
	    driver.findElement(By.xpath("//button[@aria-label='Attach' and @type='button']")).click();
	    
//	    9. Delete the Parent task
//	    10. Validate in JIRA board as Parent and Sub Task has been move out of board
	    
	    
	    
	    
	    
	    

		Thread.sleep(5000);
		driver.quit();
	}
}
