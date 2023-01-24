package PageObjectManager;

import org.openqa.selenium.WebDriver;

import fb.com.baseClass.BaseClass_fb;
import fb.com.locator.Homepage_flipkart;
import fb.com.locator.LoginPage_Adactin;
import fb.com.locator.Login_Page_fb;

public class PageObjectManager extends BaseClass_fb {
public PageObjectManager(WebDriver xdriver) {
	this.driver=xdriver;
}
private Login_Page_fb loginobj;
public Login_Page_fb getLoginobj() {
	if (loginobj==null) {
		loginobj=new Login_Page_fb(driver);
	}
	return loginobj;
}
private Homepage_flipkart homepage_fk;
public Homepage_flipkart getHomepage_fk() {
	if(homepage_fk==null) {
		homepage_fk=new Homepage_flipkart(driver);
	}
	return homepage_fk;
}
private LoginPage_Adactin objadactin;
public LoginPage_Adactin getObjadactin() {
	if(objadactin==null) {
		objadactin=new LoginPage_Adactin(driver);
	}
	return objadactin;
}



}