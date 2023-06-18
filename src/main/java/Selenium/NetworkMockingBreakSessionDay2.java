package Selenium;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.browser.Browser;
import org.openqa.selenium.devtools.v111.browser.Browser.GetVersionResponse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkMockingBreakSessionDay2 {
	
	String jiraURL = "https://sivasdetteam3.atlassian.net/jira/software/projects/SDET/boards/1/backlog";
	String s = RandomStringUtils.randomAscii(3);
	
	ChromeDriver driver;
	@Test
	public void createAssignee() throws InterruptedException {
		//3.141.59
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\SDET_PRE\\Drivers Path\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//4.9.1
		WebDriverManager.chromedriver().setup();
//		driver.executeCdpCommand(jiraURL, null)
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();

	      GetVersionResponse browser = devTools.send(Browser.getVersion());

	      System.out.println("Browser Version => "+browser.getProduct());

	      System.out.println("User Agent => "+browser.getUserAgent());
		driver.get(jiraURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		driver.quit();
	   
	}
}
