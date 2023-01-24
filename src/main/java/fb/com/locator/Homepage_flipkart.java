package fb.com.locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.baseClass.BaseClass_fb;

public class Homepage_flipkart extends BaseClass_fb {
public Homepage_flipkart(WebDriver xdriver) {
	this.driver=xdriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//div[text()='Mobiles']")
private WebElement mobile;
@FindBy(xpath = "//span[text()='Electronics']")
private WebElement electronics;
public WebElement getMobile() {
	return mobile;
}
public WebElement getElectronics() {
	return electronics;
}
public WebElement getMi() {
	return mi;
}
public WebElement getMaxprice() {
	return maxprice;
}
public WebElement getMi_mobiles() {
	return mi_mobiles;
}
public WebElement getPincode() {
	return pincode;
}
public WebElement getAddtocart() {
	return addtocart;
}
@FindBy (xpath = "//a[text()='Mi']")
private WebElement mi;
@FindBy(xpath = "(//select[@class=\"_2YxCDZ\"])[2]")
private WebElement maxprice;
@FindBy(xpath = "(//div[contains(text(),'₹')])[18]")
private WebElement mi_mobiles;
@FindBy(id = "pincodeInputId")
private WebElement pincode;
@FindBy(xpath = "//button[text()='Add to cart']")
private WebElement addtocart;
@FindBy(xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]")
public WebElement popup;
}
