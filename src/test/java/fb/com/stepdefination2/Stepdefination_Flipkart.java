package fb.com.stepdefination2;


import org.junit.Assert;

import PageObjectManager.PageObjectManager;
import fb.com.baseClass.BaseClass_fb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefination_Flipkart extends BaseClass_fb {
PageObjectManager obj=new PageObjectManager(driver);
@Given("User Launch Chrome Browser")
public void user_launch_chrome_browser() {
    browserLaunch("https://www.flipkart.com/");
}
@Given("Handle the login popup")
public void handle_the_login_popup() {
    elementClick(obj.getHomepage_fk().popup);
}
@Given("User clicks the Mobile product")
public void user_clicks_the_mobile_product() {
    elementClick(obj.getHomepage_fk().getMobile());
}
@Given("User chooses MI phone under Electronics category")
public void user_chooses_mi_phone_under_electronics_category() {
    moveToElement(obj.getHomepage_fk().getElectronics());
    elementClick(obj.getHomepage_fk().getMi());
}
@Given("User fixes the maximum price of mobile using dropdown")
public void user_fixes_the_maximum_price_of_mobile_using_dropdown() throws InterruptedException {
	ThreadSleepForSecond(5);
    selectDropdown(obj.getHomepage_fk().getMaxprice(), "text", "₹30000");
}
@Given("User clicks a product to buy")
public void user_clicks_a_product_to_buy() throws InterruptedException {}
@Given("Handling the Window to stop  desired product window {string}")
public void handling_the_window_to_stop_desired_product_window(String string) throws InterruptedException {
	ThreadSleepForSecond(3);
    Window_Handle(string);
}
@Given("User entering their Pincode {string} to know Availability and delivery of Product")
public void user_entering_their_pincode_to_know_availability_and_delivery_of_product(String string) {
    elementSendKeys(obj.getHomepage_fk().getPincode(), string);
}
@Given("User add the item to purchase by clicking add to cart Button")
public void user_add_the_item_to_purchase_by_clicking_add_to_cart_button() {
    elementClick(obj.getHomepage_fk().getAddtocart());
}
@Then("User closing the Browser")
public void user_closing_the_browser() {
   System.out.println("Flipkart add to cart task Successfully Completed");
  // close();
}
//Adactin_Task
@Given("User Launches the Chrome Browser")
public void user_launches_the_chrome_browser() {
    browserLaunch("https://adactinhotelapp.com/");
}
@Given("Verify land and Login page")
public void verify_land_and_login_page() {
    elementIsDisplayed(obj.getObjadactin().logo);
}
@Given("User Enter username {string}")
public void user_enter_username(String string) {
    elementSendKeys(obj.getObjadactin().getUsername1(), string);
}
@Given("User Enter password {string}")
public void user_enter_password(String string) {
    elementSendKeys(obj.getObjadactin().getPassword(), string);
}
@Given("User Click Login Button")
public void user_click_login_button() {
    elementClick(obj.getObjadactin().getLoginbutton());
}

@Then("User Verify Error Message {string}")
public void user_verify_error_message(String string) {
    //Assert.assertTrue(obj.getObjadactin().getErrorMessage().getText().startsWith(string));
    Assert.assertEquals(obj.getObjadactin().getErrorMessage().getText(), string);
    System.out.println("success");
}








}
