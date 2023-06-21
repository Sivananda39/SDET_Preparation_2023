package weekdaysConnectwithSathish;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
 * Selenium Assignemnt - 19/06/2023	20/06/
	
	Edit Lead
1. Launch URL
"https://leafground.com/checkbox.xhtml"
2. Enter UserName and Password Using Id Locator
3. complete all menu actions one by one
*/
public class TestLeafPlayGround1920June {
	// ChangedCredentials for GIT
	String username = "demosalesmanager";
	String password = "crmsfa";
	byte[] encodedPass = Base64.encodeBase64(password.getBytes());
	byte[] decodedPass = Base64.decodeBase64(encodedPass);
	String newpass = new String(decodedPass);
	String testLeafURL = "https://leafground.com/checkbox.xhtml";

	ChromeDriver driver;

	@Test
	public void createAssignee() throws InterruptedException, AWTException {
		
		//4.9.1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		1. Launch URL for textbox
		
		driver.get(testLeafURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Click on Menu Button 
		WebElement menu = driver.findElement(By.xpath("//form[@id='menuform']//span[text()='Element']//parent::a"));
		menu.click();
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.xpath("//a[contains(@href, 'input')]"));
		wait.until(ExpectedConditions.elementToBeClickable(textbox)).click();
		//Type your name
		WebElement name1 = driver.findElement(By.xpath("//input[@placeholder='Babu Manickam' and @role='textbox']"));
		wait.until(ExpectedConditions.elementToBeClickable(name1)).click();
		name1.sendKeys("EnterYourName");
		//Append Country to this City.
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("+ India");
		//Verify if text box is disabled
		WebElement disabled = driver.findElement(By.xpath("//input[@placeholder='Disabled' and @role='textbox']"));
		wait.until(ExpectedConditions.elementSelectionStateToBe(disabled, false));
		//Clear the typed text.
		WebElement clear = driver.findElement(By.xpath("//h5[contains(text(), 'Clear the typed')]/following::div//input[contains(@value, 'clear me')]"));
		clear.click();
		clear.clear();
		//Retrieve the typed text.
		String actual = "My learning is superb so far.";
		String retreive = driver.findElement(By.xpath("//h5[contains(text(), 'Retrieve the typed text.')]/following::div//input[contains(@value, 'superb')]")).getAttribute("value");
		System.out.println(retreive);
		assertEquals(actual, retreive);
		//Type email and Tab. Confirm control moved to next element.
		WebElement email = driver.findElement(By.xpath("//h5[contains(text(), 'email')]/following::div//input[contains(@placeholder, 'email')]"));
		email.sendKeys("email@gmail.com");
		email.sendKeys(Keys.TAB);
		email.sendKeys(Keys.ENTER);
		//Type about yourself
		WebElement yourself = driver.findElement(By.xpath("//h5[contains(text(), 'yourself')]/following::div//*[contains(@placeholder, 'yourself')]"));
		wait.until(ExpectedConditions.elementToBeClickable(yourself)).sendKeys("youreself");
		//Text Editor
		driver.findElement(By.xpath("(//h5[contains(text(), 'Editor')]/following::div//p)[1]")).sendKeys("texte ditor");
		//Just Press Enter and confirm error message*
		WebElement enter = driver.findElement(By.xpath("//h5[contains(text(), 'confirm error message')]/following::div//input[contains(@name, 'age')]"));
		enter.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String errormsg = driver.findElement(By.xpath("//span[contains(@class, 'error-detail')]")).getText();
		System.out.println(errormsg);
		String actualmsg = "Age is mandatory";
		assertEquals(actualmsg, errormsg);
		
		// Click and Confirm Label Position Changes Validation 
        WebElement label = driver.findElement(By.xpath("//label[text()='Username']")); 
        Point labelloc = label.getLocation(); 
        System.out.println("labelPos Before " + "X : " + labelloc.getX() + " Y : " + labelloc.getY()); 
        driver.findElement(By.xpath("//span[contains(@class,'float')]//input")).click(); 
        Thread.sleep(500); 
        Point labelloc2 = label.getLocation(); 
        System.out.println("labelPos After " + "X : " + labelloc2.getX() + " Y : " + labelloc2.getY()); 
        assertFalse(labelloc.equals(labelloc2));
//        Type your name and choose the third option
        WebElement nameSearch = driver.findElement(By.xpath("//h5[contains(text(), 'name')]/following::div//input[contains(@placeholder, 'Search')]"));
        nameSearch.sendKeys("Siva");
        Thread.sleep(2000);
        WebElement namelist = driver.findElement(By.xpath("//li[@role='option']"));
        wait.until(ExpectedConditions.elementToBeClickable(namelist));
        List<WebElement> ddoptions = driver.findElements((By.xpath("//li[@role='option']")));
        String thirdOption = "Siva2";
        for (int i = 0; i < ddoptions.size(); i++)
			if (ddoptions.get(i).getText().equals(thirdOption) && i == 2) {
				ddoptions.get(i).click();
				break;
			}
        String thirOptionActual = driver.findElement(By.xpath("(//li[contains(@class,'active ')]/span)[2]")).getText();
        Thread.sleep(1000);
        assertEquals(thirOptionActual, thirdOption);
        
//        Type your DOB (mm/dd/yyyy) and confirm date chosen
        WebElement calendar = driver.findElement(By.xpath("//span[contains(@class, 'calendar')]/input"));
        calendar.sendKeys("8/9/1994");
        driver.findElement(By.xpath("//a[contains(@class,'active')]")).click();
		assertEquals("8/9/1994",calendar.getAttribute("value"));
        
//        Type number and spin to confirm value changed
		WebElement number = driver.findElement(By.xpath("//span[contains(@class, 'spinner')]/input"));
		number.sendKeys("50");
		WebElement up = driver.findElement(By.xpath("//span[contains(@class,'triangle-1-n')]"));
		WebElement down = driver.findElement(By.xpath("(//span[contains(@class,'triangle-1-s')])[2]"));
		up.click();
		Thread.sleep(1000);
		down.click();
		assertEquals("50",number.getAttribute("value"));
//        Type random number (1-100) and confirm slider moves correctly
		driver.findElement(By.xpath("//input[contains(@id,'slider')]")).sendKeys("54");
		Thread.sleep(1000);
		String sliderValue = driver
				.findElement(By.xpath("//input[contains(@id,'slider')]//following-sibling::div/span"))
				.getAttribute("style").replace("left: ", "");
		assertEquals("54", sliderValue.replace("%", "").replace(";", ""));
//        Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[contains(@class,'keyboard')]")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//div[contains(@class,'shadow keypad')]")).isDisplayed());
		driver.findElement(By.xpath("//button[@type='button' and text()='Close']")).click();
//        Custom Toolbar
		
		driver.findElement(By.xpath("(//h5[contains(text(), 'Editor')]/following::div//p)[2]")).sendKeys("Custom Toolbar");
		
		
//		2. Launch menu for button
		driver.navigate().to("https://leafground.com/button.xhtml");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
//		Thread.sleep(1000);
//		WebElement button = driver.findElement(By.xpath("//a[contains(@href, 'button')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
//		Click and Confirm title.
		WebElement click = driver.findElement(By.xpath("//h5[contains(text(), 'Click and Confirm title.')]/following::button/span[text()='Click']"));
		click.click();
		String title = driver.getTitle();
		assertEquals("Dashboard", title);
		
//		Confirm if the button is disabled.
		driver.navigate().to("https://leafground.com/button.xhtml");
		Thread.sleep(3000);
		WebElement disbaledButton = driver.findElement(By.xpath("//h5[contains(text(), 'disabled')]/following::button/span[text()='Disabled']"));
		wait.until(ExpectedConditions.elementSelectionStateToBe(disbaledButton, false));
//		Find the position of the Submit button
		WebElement submitButton = driver.findElement(By.xpath("(//h5[contains(text(), 'Submit')]/following::button/span[text()='Submit'])[1]"));
		Point submitBtn = submitButton.getLocation();
		System.out.println("The position of submit button : " +submitBtn);
		
//		Find the Save button color
		WebElement save = driver.findElement(By.xpath("//h5[contains(text(), 'Save button')]/following::button/span[text()='Save']"));
		String saveBtn = save.getCssValue("background-color");
		String btncolor = Color.fromString(saveBtn).asHex();
		System.out.println(btncolor);
//		Find the height and width of this button
		WebElement submitButton2 = driver.findElement(By.xpath("(//h5[contains(text(), 'Submit')]/following::button/span[text()='Submit'])[2]"));
		Dimension  submitBtn2 = submitButton.getSize();
		System.out.println("The Height of submit button : " +submitBtn2.getHeight());
		System.out.println("The Width of submit button : " +submitBtn2.getWidth());
//		Mouse over and confirm the color changed
		WebElement success = driver.findElement(By.xpath("(//h5[contains(text(), 'Mouse over')]/following::button/span[text()='Success'])[1]"));
		String successBtn = success.getCssValue("background-color");
		String successbtncolor = Color.fromString(successBtn).asHex();
		System.out.println(btncolor);
		Actions action = new Actions(driver);
		action.moveToElement(success).perform();
		Thread.sleep(1000);
		String successBtn2 = success.getCssValue("background-color");
		String successbtncolorafterClick = Color.fromString(successBtn2).asHex();
		assertFalse(successbtncolor.equals(successbtncolorafterClick));
		
//		Click Image Button and Click on any hidden button
		WebElement image = driver.findElement(By.xpath("//button[contains(@name, 'imageBtn')]/span"));
		image.click();
		Thread.sleep(500);
		image.click();
		
//		How many rounded buttons are there?
		List<WebElement> roundBtns = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		System.out.println("Rounded buttons count : " + roundBtns.size());	
		
//		3 . Launch menu for dropdown
		
		
		driver.navigate().to("https://leafground.com/select.xhtml");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
//		Thread.sleep(1000);
//		WebElement dropdown = driver.findElement(By.xpath("//a[contains(@href, 'select')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();

		// Which is your favorite UI Automation tool?
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@class, 'selectonemenu')]")));
		select.selectByVisibleText("Selenium");

		// Choose the Course
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Selenium WebDriver']")));
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();

		// Choose your preferred country.
		driver.findElement(By.xpath("//label[contains(@id,'country_label')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='India']")).click();

		// Choose language randomly
		driver.findElement(By.xpath("//label[contains(@id,'lang_label')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[@data-label='Telugu']")).click();

		// Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("//label[contains(@id,'city_label')]")).click();
		Thread.sleep(500);
		List<String> cities_Actual = new ArrayList<String>();
		List<String> cities_expected = new ArrayList<String>(Arrays.asList("Bengaluru", "Chennai", "Delhi"));
		List<WebElement> cityElements = driver
				.findElements(By.xpath("//option[text()='Select City']//following-sibling::option"));
		for (WebElement elem : cityElements)
			cities_Actual.add(elem.getAttribute("value"));
		assertEquals(cities_expected, cities_Actual);

		// Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[contains(@id,'value_label')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[@data-label='రెండు']")).click();
		
		
//		4 . Launch menu for checkbox
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
//		Thread.sleep(1000);
//		WebElement checkbox = driver.findElement(By.xpath("//a[contains(@href, 'checkbox')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		
		// Basic Checkbox
		driver.findElement(By.xpath("//*[text()='Basic']//preceding-sibling::div[contains(@class,'chkbox')]")).click();
	
		// Notification
		WebElement notef = driver.findElement(By.xpath("//span[text()='Ajax']/../div[contains(@class,'chkbox')]"));
		wait.until(ExpectedConditions.elementToBeClickable(notef)).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).getText().contains("Checked"));

		// Verify if check box is disabled
		WebElement disabledCheckbox = driver.findElement(By.xpath("(//h5[contains(text(), 'Notification')]/following::div//span)[9]"));
		wait.until(ExpectedConditions.elementSelectionStateToBe(disabledCheckbox, false));

		// Choose your favorite language(s)
		driver.findElement(By.xpath("(//*[contains(@class,'selectmanycheckbox')]//td/div)[1]")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'selectmanycheckbox')]//td/div)[2]")).click();

		// Select Multiple
		driver.findElement(By.xpath("//div[contains(@id,'multiple') and @role='combobox']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='London']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Paris']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Berlin']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//div[contains(@id,'multiple') and @role='combobox']")).click();

		// Tri State Checkbox
		driver.findElement(By.xpath("//div[contains(@id,'TriState')]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'TriState')]")).click();
		// Toggle Switch
		driver.findElement(By.xpath("//div[contains(@class,'slider')]")).click();
		Thread.sleep(5000);
//		5 . Launch menu for radioBTN
		driver.navigate().to("https://leafground.com/radio.xhtml");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
//		Thread.sleep(1000);
//		WebElement radio = driver.findElement(By.xpath("//a[contains(@href, 'radio')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(radio)).click();
		
		// Your most favorite browser
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]/../div")).click();

		// Find the default select radio button
		driver.findElement(By.xpath("(//label[text()='Chrome'])[2]/../div")).click();

		// UnSelectable
		driver.findElement(By.xpath("//label[text()='Bengaluru']//./preceding-sibling::div")).click();

		// Select the age group (only if not selected)
		List<WebElement> ageRadioBtn = driver.findElements(By.xpath("//label[contains(text(),'Years')]//../div[contains(@class,'radiobutton')]"));
		List<WebElement> age = driver.findElements(By.xpath("//label[contains(text(),'Years')]"));
		for (int i = 0; i < ageRadioBtn.size(); i++)
			if (age.get(i).getText().equals("21-40 Years")
					&& !ageRadioBtn.get(i).getAttribute("class").contains("active"))
				driver.findElement(By.xpath("(//label[contains(text(),'21-40')]//..//div)[last()]")).click();
//		6 . Launch menu for HyperLink
		driver.navigate().to("https://leafground.com/link.xhtml");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
//		Thread.sleep(1000);
//		WebElement link = driver.findElement(By.xpath("//a[contains(@href, 'link')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(link)).click();
		
		// Take me to dashboard
		driver.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(1500);
		assertEquals("Dashboard", driver.getTitle());
		driver.navigate().to("https://leafground.com/link.xhtml");
		Thread.sleep(3000);
		
		// Duplicate Link
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
		driver.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(1500);
		assertEquals("Dashboard", driver.getTitle());

		// Find my destination - Find the URL without clicking me.
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();

		assertEquals("https://leafground.com/grid.xhtml",
				driver.findElement(By.xpath("//a[contains(text(),'without')]")).getAttribute("href"));

		// How many links in this page?
		List<WebElement> numofLinks = driver.findElements(By.tagName("a"));
		System.out.println("How many links in this page : " + numofLinks.size());

		// Am I broken link?
		try {
			URL url = new URL(driver.findElement(By.xpath("//a[text()='Broken?']")).getAttribute("href"));
			HttpURLConnection httpUrlConnect = (HttpURLConnection) url.openConnection();
			httpUrlConnect.setConnectTimeout(5000);
			httpUrlConnect.connect();
			if (httpUrlConnect.getResponseCode() >= 400)
				System.out.println(url + " - " + httpUrlConnect.getResponseMessage() + " is a broken link");
			else
				System.out.println(url + " - " + httpUrlConnect.getResponseMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Count Layout Links
		List<WebElement> numberofLinks = driver.findElements(By.xpath("//h5/following-sibling::div//a"));
		System.out.println("How many links in this layout : " + numberofLinks.size());

		
//		7 . Launch menu for Waits
		driver.navigate().to("https://leafground.com/waits.xhtml");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
//		Thread.sleep(1000);
//		WebElement waits = driver.findElement(By.xpath("//a[contains(@href, 'waits')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(waits)).click();
		
		// Wait for Visibility (1 - 10 Sec)
		driver.findElement(By.xpath("//*[contains(text(),'Visibility ')]//following-sibling::div//button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		driver.findElement(By.xpath("//span[text()='I am here']")).click();

		// Wait for Clickability
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		List<WebElement> alert = driver.findElements(By.cssSelector("[role='alert']"));
		wait.until(ExpectedConditions.invisibilityOfAllElements(alert));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		driver.findElement(By.xpath("//span[text()='Click Second']")).click();

		// Wait for Invisibility (1 - 10 Sec)
		driver.findElement(By.xpath("(//*[contains(text(),'Invisibility ')]//following-sibling::div//button)[1]"))
				.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));

		// Wait for Text Change (1 - 10 Sec)
		String text_before = driver
				.findElement(By.xpath("(//button[contains(@class,'danger')]//following::span)[last()]")).getText();
		driver.findElement(By.xpath("//button[contains(@class,'danger')]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
				By.xpath("(//button[contains(@class,'danger')]//following::span)[last()]"), "Did you notice?"));
		String text_After = driver
				.findElement(By.xpath("(//button[contains(@class,'danger')]//following::span)[last()]")).getText();
		assertFalse(text_before.equals(text_After));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
