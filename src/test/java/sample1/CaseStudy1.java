package sample1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 {
	WebDriver driver;

	@Given("user opens the chrome browser")
	public void user_opens_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("enters the url")
	public void enters_the_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@Given("enter the username as {string}")
	public void enter_the_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);

	}

	@When("enter the first name as {string}")
	public void enter_the_first_name_as(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("enter the second name as {string}")
	public void enter_the_second_name_as(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("enter the password as {string}")
	public void enter_the_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("confirm the password as {string}")
	public void confirm_the_password_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("check the gender box")
	public void check_the_gender_box() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@When("enter the email id as {string}")
	public void enter_the_email_id_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("enter the mobile number as {string}")
	public void enter_the_mobile_number_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("enter the dob")
	public void enter_the_dob() {
		driver.findElement(By.xpath("//img[@title='Ch']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select selMonth = new Select(month);
		selMonth.selectByValue("6");
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select selYear = new Select(year);
		selYear.selectByValue("1998");
		WebElement cal = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table"));
		cal.findElement(By.linkText("30")).click();
	}

	@When("enter the address")
	public void enter_the_address() {
		driver.findElement(By.id("address")).sendKeys("Selaiyur chennai");
	}

	@When("enter the answer")
	public void enter_the_answer() {
		driver.findElement(By.id("answer")).sendKeys("Chennai");
	}

	@When("user clicks register button")
	public void user_clicks_register_button() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("verify registration")
	public void verify_registration() {
		String flag3 = driver.findElement(By.xpath("//div[@id='errormsg']/following-sibling::div[3]")).getText();
		System.out.println(flag3);
		Assert.assertEquals("User Registered Succesfully!!! Please login", flag3);
		driver.close();
	}

}
