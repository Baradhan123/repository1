package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fb.com.baseClass.BaseClass_fb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing1 extends BaseClass_fb{
	@Test
	@Parameters("browser")
public static void browsingLaunch(String option) {
		if (option.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		 if (option.equalsIgnoreCase("edge")) {
			//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver", ".\\Edge Driver\\msedgedriver.exe");

			driver=new EdgeDriver();
		} 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		windowMax();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("919786486401");
	driver.findElement(By.id("pass")).sendKeys("386770123@@@");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();

}
	@Test
public static void launch() {
	//edgebrowser_Launch("https://www.facebook.com/");
	System.out.println("success");

}
}
