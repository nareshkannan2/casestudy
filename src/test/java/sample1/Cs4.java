package sample1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs4 {
	WebDriver driver;

	@Given("lalitha has registered in to TestMeApp")
	public void lalitha_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("lalitha search a particular product like headphones")
	public void lalitha_search_a_particular_product_like_headphones() {
		driver.findElement(By.name("products")).click();
		driver.findElement(By.name("products")).sendKeys("headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		String title = driver.getTitle();
		Assert.assertNotSame("Payment Gateway", title);
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
		boolean title = driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		Assert.assertNotEquals("Cart 1", title);
		driver.close();
	}
}
