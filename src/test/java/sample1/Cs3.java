package sample1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs3 {
	WebDriver driver;

	@Given("user opens the browser")
	public void user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@Then("user enters the username as {string} and password as {string}")
	public void user_enters_the_username_as_and_password_as(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@When("user find the home page")
	public void user_find_the_home_page() {
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}

	@Then("user clicks the search engine")
	public void user_clicks_the_search_engine() throws InterruptedException {
		driver.findElement(By.name("products")).click();
		driver.findElement(By.name("products")).sendKeys("headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("user add the product to cart")
	public void user_add_the_product_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("user checks out the product")
	public void user_checks_out_the_product() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@Then("user reviews the product")
	public void user_reviews_the_product() {
		String title = driver.getTitle();
		Assert.assertEquals("View Cart", title);
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	}

	@Then("proceed to payment")
	public void proceed_to_payment() {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@Then("user select the bank")
	public void user_select_the_bank() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		driver.findElement(By.id("btn")).click();
	}

	@Then("user login to the payment gateway")
	public void user_login_to_the_payment_gateway() {
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

	@Then("user enters the tranpassword as {string}")
	public void user_enters_the_tranpassword_as(String string) {
		driver.findElement(By.name("transpwd")).sendKeys(string);

	}

	@Then("user clicks the pay now button")
	public void user_clicks_the_pay_now_button() {
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

	@Then("user verifies the order details")
	public void user_verifies_the_order_details() {
		String title = driver.getTitle();
		Assert.assertEquals("Order Details", title);
	}

	@Then("SignOut button is clicked")
	public void signout_button_is_clicked() {
		driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		driver.close();
	}
}
