package StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	static WebDriver driver;
	@Given("User is on Add User page")
	public void user_is_on_add_user_page() {
	    
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
	//	throw new io.cucumber.java.PendingException();
	}

	@When("User enters First Name, Last Name, Email and Password")
	public void user_enters_first_name_last_name_email_and_password() {
		
		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Smith");
		driver.findElement(By.id("email")).sendKeys("John.Smith2023@ymail.com");
		driver.findElement(By.id("password")).sendKeys("John.Smith2024");
	 //   throw new io.cucumber.java.PendingException();
	}

	@And("Clicks on Submit button")
	public void clicks_on_submit_button() {
	    
		driver.findElement(By.id("submit")).click();
	//    throw new io.cucumber.java.PendingException();
	}

	@Then("The User is navigated to Contact List page and clicks on Logout button")
	public void the_user_is_navigated_to_Contact_List_page_and_clicks_on_Logout_button() {
	    
		driver.findElement(By.id("logout")).click();
	//    throw new io.cucumber.java.PendingException();
	}

	@And("Close the browser")
	public void close_the_browser() {
	    driver.quit(); 
	 //   throw new io.cucumber.java.PendingException();
	}
 
}
