package Testng;

import org.testng.annotations.Test;

import PageObjectManager.PageObjectManager;
import fb.com.baseClass.BaseClass_fb;

public class dependancy extends BaseClass_fb{
	PageObjectManager obj=new PageObjectManager(driver);
	@Test (priority=1)
private void browserlaunch() {
		browserLaunch("https://www.facebook.com/");
	System.out.println("Browser Launch");
}
	@Test (dependsOnMethods = "browserlaunch" )
	private void sendkeys() {
		elementSendKeys(obj.getLoginobj().username, "Baradhan");
		elementSendKeys(obj.getLoginobj().password, "Baradhan123");
		System.out.println("Username is:Baradhan");
		System.out.println("Password is :Baradhan123");
	}
	@Test (dependsOnMethods = "sendkeys")
	private void clicklogin() {
		elementClick(obj.getLoginobj().login);
		System.out.println("success");
	}
}
