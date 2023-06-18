package Selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
//from Testleaf Mentor to everyone:    5:40 PM
//Login to JIRA in incognito
//Click on Projects
//Click 'View All projects'
//Enter and invalid Project name and validate the text
//Enter valid project Name
//Click the project
//Collect the list of issues in the board
//Open a new tab and Create a new issues
//Refresh and validate does the board has newly created issue
//Create a bug with blocked by newly created issue
//Change the status as Done for the newly created bug and validate the status in the board
public class JiraAssignee28MayBreakOutSession {
	//ChangedCredentials for GIT
	String email = "shiSDSDSDSDSDand@gmail.com";
	String passKey = "#$#$#$#$@sdasdsd";
	String jiraURL = "https://sivasdetteam3.atlassian.net/jira/software/projects/SDET/boards/1/backlog";
	String s = "No projects were found that match your search";
	String bugName = "Sample2 - created By Siva as a BUG";
	
	ChromeDriver driver;
	@Test
	public void createAssignee() throws InterruptedException, AWTException {
		//3.141.59
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\SDET_PRE\\Drivers Path\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		
		driver = new ChromeDriver(option);
		//4.9.1
		WebDriverManager.chromedriver().setup();
		
		//Login to JIRA in incognito
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
		//Click on Projects
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']/span[contains(text(), 'Projects')]")));
	    driver.findElement(By.xpath("//button[@type='button']/span[contains(text(), 'Projects')]")).click();
	  //Click 'View All projects'
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'View all projects') and @data-item-title='true']")));
	    driver.findElement(By.xpath("//span[contains(text(), 'View all projects') and @data-item-title='true']")).click();
	  //Enter and invalid Project name and validate the text
	    driver.findElement(By.xpath("//input[@data-test-id='searchfield' and @name='search']")).click();
	    driver.findElement(By.xpath("//input[@data-test-id='searchfield' and @name='search']")).sendKeys("OOO");
	    driver.findElement(By.xpath("//h4[contains(text(), 'No projects')]")).isDisplayed();
	    String Ele = driver.findElement(By.xpath("//h4[contains(text(), 'No projects')]")).getText();
	    System.out.println("The mesage for no project is : " + Ele);
	    System.out.println("The mesage for no project expected is  : " + s);
	    Assert.assertEquals(Ele, s);
	    assertEquals(Ele, s);
	  //Enter valid project Name
	    driver.findElement(By.xpath("//button[contains(@data-test-id, 'clear-button')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@data-test-id='searchfield' and @name='search']")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@data-test-id='searchfield' and @name='search']")).sendKeys("SDETTeamThreePractice");
	  //Click the project
	    driver.findElement(By.xpath("//span[contains(text(), 'SDET')]")).isDisplayed();
	    driver.findElement(By.xpath("//span[contains(text(), 'SDET')]")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'SDET')]")));
	    String projName = driver.findElement(By.xpath("//h1[contains(text(), 'SDET')]")).getText();
	    System.out.println("The Valid Project name is : " + projName);
	    String todo = driver.findElement(By.xpath("//div[contains(text(), 'To Do')]")).getText();
	    System.out.println(todo);
	    String issues = driver.findElement(By.xpath("//h2[contains(@aria-label, 'To Do')]//following-sibling::div[contains(text(), 'issues')]")).getText();
	    System.out.println(issues);
	    String countofIssues = driver.findElement(By.xpath("//span[contains(@style, 'hidden') and contains(text(), '')]")).getText();
	  //Collect the list of issues in the board
	    System.out.println("The list of issues are : " + countofIssues + issues);
	  //Open a new tab and Create a new issues
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
	   driver.get(jiraURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      Thread.sleep(8000);
	      // store window handle ids
	      ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
	      //switch to open tab
	      driver.switchTo().window(w.get(1));
	      System.out.println("New tab title: " + driver.getTitle());
	      //switch to first tab
	      driver.switchTo().window(w.get(0));
	      System.out.println("First tab title: " + driver.getTitle());
	    //Login to JIRA in newTab
			
	      driver.switchTo().window(w.get(1));
			driver.findElement(By.xpath("//input[@id='username' and @type='email']")).sendKeys(email);
			Thread.sleep(5000);
			WebElement login2 = driver.findElement(By.xpath("//button[@id='login-submit']/span[contains(., 'Continue')]"));
			wait.until(ExpectedConditions.elementToBeClickable(login2));
			login2.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys(passKey);
			Thread.sleep(1000);
			login2.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@id='createGlobalItem']")).click();
		    driver.findElement(By.id("summary-field")).click();
		    driver.findElement(By.id("summary-field")).sendKeys("Sample - created By Siva for Automation Hands ON ");
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		   
		    Thread.sleep(1000);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'Sprint')]")));
		    driver.findElement(By.xpath("//div[contains(text(), 'Select sprint')]")).click();
		    driver.findElement(By.xpath("//div[contains(@data-test-id, 'customfield_10020')]//div[contains(text(), 'Sprint 1')]")).click();
		    Thread.sleep(1000);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
	  //Refresh and validate does the board has newly created issue
		    driver.switchTo().window(w.get(0));
		      System.out.println("First tab title: " + driver.getTitle());
		      driver.navigate().refresh();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    //Collect the list of issues in the board
		      String countofIssues2 = driver.findElement(By.xpath("(//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span")).getText();
		      Thread.sleep(2000);
		      System.out.println("The updated list of issues are : " + countofIssues2 );
			  assertNotEquals(countofIssues2, countofIssues);
			  
	  //Create a bug with blocked by newly created issue
			  driver.findElement(By.xpath("//button[@id='createGlobalItem']")).click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'Issue type')]")));
//			    driver.findElement(By.xpath("//div[contains(text(), 'Story')]")).click();
			    driver.findElement(By.xpath("//div[contains(@id, 'issue-type-select')]//div[contains(text(), 'Bug')]")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//input[@id='summary-field' and @type='text']")).click();
			    driver.findElement(By.xpath("//input[@id='summary-field' and @type='text']")).sendKeys(bugName);
			
			    js.executeScript("window.scrollBy(0,1000)");
			   
			    Thread.sleep(1000);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'Sprint')]")));
			    driver.findElement(By.xpath("//div[contains(text(), 'Select sprint')]")).click();
			    driver.findElement(By.xpath("//div[@data-test-id=\"issue-create.ui.modal.create-form.layout-renderer.field-renderer.field.customfield_10020\"]//div[contains(text(), 'Sprint 1')]")).click();
			    Thread.sleep(1000);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			  
	  //Change the status as Done for the newly created bug and validate the status in the board
			    Thread.sleep(3000);
			    WebElement bug = driver.findElement(By.xpath("//div[contains(@data-rbd-drag-handle-draggable-id, 'ISSUE::1004')]//span[contains(text(), 'BUG')]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bug);
			    Thread.sleep(1000);
			   
			    driver.findElement(By.xpath("//button[contains(@aria-label, 'To Do - Change status')]")).click();
			    driver.findElement(By.xpath("//button[contains(@aria-label, 'Done - Change status')]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//button[@aria-label='Close' and @type='button']")).click();
			    Thread.sleep(1000);
			    String done = driver.findElement(By.xpath("//div[contains(text(), 'Done')]")).getText();
			    System.out.println(done);
			    String isues = driver.findElement(By.xpath("//h2[contains(@aria-label, 'Done')]//following-sibling::div[contains(text(), 'issue')]")).getText();
			    System.out.println(isues);
			    String Completed = driver.findElement(By.xpath("//h2[contains(@aria-label, 'Done')]//following-sibling::div//span[contains(@style, 'hidden') and contains(text(), '')]")).getText();
			  //Collect the list of issues in the board
			    System.out.println("The list of Completed DONE issue are : " + Completed + isues);
			    
	   
	}
}
