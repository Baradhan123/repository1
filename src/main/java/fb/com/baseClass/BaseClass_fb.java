package fb.com.baseClass;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_fb {
public static WebDriver driver;
public static void browserLaunch(String option,String url) {
	if (option.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (option.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	} 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	windowMax();
	getUrl(url);
}
public static void edgebrowser_Launch(String url) {
	System.setProperty("webdriver.edge.driver", ".\\Edge Driver\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	windowMax();
	getUrl(url);
}
public static void windowMax() {
	try {
		driver.manage().window().maximize();
	} catch (Exception e) {
		System.out.println("Could't maximize window"+e.getMessage());
	} 

}
public static void getUrl(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		System.out.println("Invalid Url:"+e.getMessage());
	}

}
public static boolean elementIsDisplayed(WebElement element) {
	boolean displayed=false;
	try {
		displayed=element.isDisplayed();
	} catch (Exception e) {
		System.out.println("Element not Displayed:"+e.getMessage());
	}
	return displayed;
}
public static void elementSendKeys(WebElement element,String value) {
	try {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.visibilityOfAllElements(element));
		if (elementIsDisplayed(element)&&elementIsEnabled(element)) {
			element.clear();
			element.sendKeys(value);
		}else {
			System.err.println("Unable to pass Sendkeys");
		}
	} catch (Exception e) {
		System.out.println("Unable to pass the value :"+e.getMessage());
	}

}
public static boolean elementIsEnabled(WebElement element) {
	boolean enabled=false;
	try {
		enabled=element.isDisplayed();
		
	} catch (Exception e) {
		System.out.println("Element is not enabled:"+e.getMessage());
	}
	return enabled;
}
public static void elementClear(WebElement element) {
	try {
		element.clear();
	} catch (Exception e) {
		// TODO: handle exception
	}

}
public static void elementClick(WebElement element) {
	try {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.elementToBeClickable(element)).click();
	} catch (Exception e) {
		System.out.println("Unable to Click : "+e.getMessage());
	}

}
public static void Window_Handle(String Exp_Title) {
	Set<String> windowHandles = driver.getWindowHandles();
	for (String id : windowHandles) {
		String Act_Title = driver.switchTo().window(id).getTitle();
		if (Act_Title.equals(Exp_Title)) {
			break;
		}
	}
}
public static void selectDropdown(WebElement element,String option,String value) {
	Select sc=new Select(element);
	if (option.equals("value")) {
		sc.selectByValue(value);
	}else if (option.equals("text")) {
		sc.selectByVisibleText(value);
	}else if (option.equals("index")) {
		sc.selectByIndex(Integer.parseInt(value));
	}
}
public static void moveToElement(WebElement element) {
	try {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();;
		
	} catch (Exception e) {
		System.out.println("Actions Can't be done:"+e.getMessage());
	}
	
}
public static void ThreadSleepForSecond(int sec) throws InterruptedException {
	TimeUnit.SECONDS.sleep(sec);

}
public static void quit() {
	try {
		driver.quit();
	} catch (Exception e) {
		System.out.println("Couln't quit window"+e.getMessage());
	}
}
public static void close() {
	try {
		driver.close();
	} catch (Exception e) {
		System.out.println("Couln't close the windows "+e.getMessage());
	}
}
}
