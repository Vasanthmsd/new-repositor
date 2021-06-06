package Com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import okhttp3.internal.cache.DiskLruCache.Snapshot;

public class Base_Class {
	
	public static WebDriver driver;

	
	
	public static WebDriver getdriver(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				
				 driver = new ChromeDriver();
				
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", 
						System.getProperty("user.dir")+"Driver\\geckodriver.exe");
				
				 driver = new FirefoxDriver();
				
				
			}
			driver.manage().window().maximize();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
		
	}	
	
	public static void ClickonElement(WebElement element) {
		element.click();
		}
	
	public static void geturl(String url) {
		driver.get(url);

	}
	
	public static void close() {
		driver.close();

	}
	public static void sleep(int seconds) throws Throwable {
		Thread.sleep(seconds);

	}
     public static void Quit() {
       driver.quit();

   
}
 
  public static void to(String url) {
	  driver.navigate().to(url);

}
     public static void back() {
    	 driver.navigate().back();

	}
     public static void forward() {
    	 try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
     public static void refresh() {
    	 try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
     public static void accept() {
    	 try {
			Alert Confirm_Alert = driver.switchTo().alert();
			 Confirm_Alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 
    	 

	}
     public static void dismiss() {
    	 try {
			Alert Cancel_Alert = driver.switchTo().alert();
			 Cancel_Alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 

	}
     public static void prompt() {
    	 Alert prompt = driver.switchTo().alert();
    	 String text = prompt.getText();
    	 System.out.println(text);
    	 prompt.accept();
    	 
	}
     public static void actions(WebElement element) {
    	 Actions a = new Actions(driver);
    	 a.click(element).build().perform();

	}
 	public static void inputvalueElement(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
     public static void actionsmethod(WebElement element, String type) {
    	 Actions a = new Actions(driver);
    	 
    	 if (type.equalsIgnoreCase("click")) {
    		 a.moveToElement(element).build().perform();

			
		}
    	 else if (type.equalsIgnoreCase("context click")) {
    		 a.contextClick(element).build().perform();
			
		}
    	 else if (type.equalsIgnoreCase("doubleclick")) {
    		 a.doubleClick(element).build().perform();
			
		}
    	 else if (type.equalsIgnoreCase("move")) {
    		 a.moveToElement(element).build().perform();
			
		}
    	 

	}
     public void draganddrop(WebElement source,WebElement target) {
    	 Actions a = new Actions(driver);
    	 a.dragAndDrop(source, target).build().perform();
     }
     
     public static void frame(WebElement element) {
    	 driver.switchTo().frame(element);

	}
     
     public static void intframe(int index) {
    	 driver.switchTo().frame(index);

	}
     public static void parentframe() {
    	 driver.switchTo().parentFrame();

	}
     
     public static void mainframe() {
    	 driver.switchTo().defaultContent();
    	 

	}public static void robot() throws Throwable {
		 Robot r = new Robot();
    	 r.keyPress(KeyEvent.VK_DOWN);
    	 r.keyRelease(KeyEvent.VK_DOWN);
    	 
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 r.keyRelease(KeyEvent.VK_ENTER);


	}
	public static void dropdown(WebElement element, String type,String value) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byindex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
				
			}
			else if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
				
			}
			else if (type.equalsIgnoreCase("byvisibletext")) {
				s.selectByVisibleText(value);
				
			}
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
	public static void snap_shot(String path) throws Throwable {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	public static void waitmethod(String type,int duration,TimeUnit format,WebElement element) {
		if (type.equalsIgnoreCase("implicit")) {
			driver.manage().timeouts().implicitlyWait(duration, format);
			
		}
		else if ((type.equalsIgnoreCase("pageloadtimeout"))) {
			
			driver.manage().timeouts().pageLoadTimeout(duration, format);
			

		}else if (type.equalsIgnoreCase("explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, duration);
			wait.until(ExpectedConditions.visibilityOf(element));
			
			
		}
//		else if (type.equalsIgnoreCase("fluent")) {
//			Wait w = new FluentWait(driver).withTimeout(duration, format).pollingEvery(duration)
//					
//			
//		}

	}
	public static void is_displayed(WebElement element,String type) {
	
		if (type.equalsIgnoreCase("isdisplayed")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
			
		}
		else if (type.equalsIgnoreCase("isenabled")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
			
		}
		else if (type.equalsIgnoreCase("isselected")) {

			boolean selected = element.isSelected();
			System.out.println(selected);
			
		}
		

	}
	public static void currenturl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//	public static void getoptions(WebElement element,int num, String value) {
//		Select s = new Select(element);
//	List<WebElement> alloptions = s.getOptions();
//	int size = alloptions.size();
//	System.out.println("size"+size);
//	
//	for (int i = 0; i < array.length; i++) {
//		if (i==num) {
//			
//		}
//		
//		
//	}
//	
//	}
	public static void getattribute(String type) {
		
		if (type.equalsIgnoreCase("value")) {
			System.out.println("attribute");
			
		}
		else if (type.equalsIgnoreCase("id")) {
			System.out.println("attribute");
			
		}
		

	}
	public static void multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
	}
//	public static void firstselected(WebElement element) {
//		Select s = new Select(element);
//		WebElement firstSelectedOption = s.getFirstSelectedOption();
//		String text = firstSelectedOption.getText();
//		System.out.println("all options");
//		for (WebElement options: alloptions) {
//			
//		}
		

	}
	    
     



	
     
     
     
     
     
     
     
  
     
     
	
		
	
