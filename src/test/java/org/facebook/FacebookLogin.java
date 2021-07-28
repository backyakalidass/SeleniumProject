package org.facebook;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pages.LoginPage;

public class FacebookLogin extends BaseClass {
	WebDriver driver;
	LoginPage l;

	@Given("launch the browser")
	public void launch_the_browser() {
		System.out.println("Launching browser");
		driver = BaseClass.setup();
		l = new LoginPage(driver);
	}

	@Given("open facebook url")
	public void open_facebook_url() {
		launch("https://en-gb.facebook.com/");
	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		
		  //WebElement email = driver.findElement(By.id("email")); 
		  //WebElement pass =  driver.findElement(By.id("pass")); 
		  //send(email, username); 
		 // send(pass,password);		 
		l.setUsername(username);
		l.setPassword(password);
	}
	

	@When("enter the username and passowrd")
	public void enter_the_username_and_passowrd(DataTable dataTable) {
		//one dimension with out Header
		//List<String> asList = dataTable.asList();
		//one dimension with Header
		//Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		//two dimension with out Header
		//List<List<String>> asLists = dataTable.asLists();
		//two dimension with Header
		List<Map<String, String>> asMaps = dataTable.asMaps();
		l.setUsername(asMaps.get(1).get("Username"));//get(row).get(columnHeader)
		l.setPassword(asMaps.get(1).get("Password"));
	}




	@When("enter the username and passord")
	public void enter_the_username_and_passord() {
		/*
		 * WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		 * email.sendKeys("backyakalidass@gmail.com"); WebElement pwd =
		 * driver.findElement(By.xpath("//input[@id='pass']"));
		 * pwd.sendKeys("Test12345");
		 */
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		send(email, "dassbackya@gmail.com");
		send(pass, "Senthil*14");
	}

	@Then("click the login button")
	public void click_the_login_button() {
		WebElement login1 = driver.findElement(By.xpath("//button[@name='login']"));
		click(login1);
	}

	@Then("valdate the welcome message")
	public void valdate_the_welcome_message() {
		System.out.println("Welcome");
	}

}
