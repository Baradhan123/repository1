package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.baseClass.BaseClass_fb;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass_fb {
@ Before 
public void beforehooks() {
	System.out.println("am Before Hooks");

}
@ After
public void afterhooks(Scenario scenario) {
	System.out.println("am After Hooks");
	TakesScreenshot ts=(TakesScreenshot)driver;
	byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshotAs, "image/png", "screenshot");
	driver.quit();
}
}
