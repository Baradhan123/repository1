package fb.com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.baseClass.BaseClass_fb;

public class Login_Page_fb extends BaseClass_fb {
public Login_Page_fb(WebDriver xdriver) {
	this.driver=xdriver;
	PageFactory.initElements(driver, this);
}
@FindBy (css = "img[alt='Facebook']")
public WebElement facebook_logo;
@FindBy(id = "email")
public WebElement username;
@FindBy(id = "pass")
public WebElement password;
@FindBy(xpath = "//button[text()='Log in']")
public WebElement login;
}
