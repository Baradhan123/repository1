package fb.com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.baseClass.BaseClass_fb;

public class LoginPage_Adactin extends BaseClass_fb{
	public LoginPage_Adactin(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement username1;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement loginbutton;
	@FindBy(css = "[class=\"auth_error\"]")
	private WebElement errorMessage;
	public WebElement getUsername1() {
		return username1;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	@FindBy(css = "[class='logo']")
	public WebElement logo;
}
