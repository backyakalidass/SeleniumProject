package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
WebDriver driver;	
		public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
@CacheLookup
@FindBy(id="email")
public WebElement username;
@CacheLookup
@FindBy(id="pass")
public WebElement password;
public WebElement getUsername() {
	return username;
}
public void setUsername(String user) {
	send(username, user);
}
public WebElement getPassword() {
	return password;
}
public void setPassword(String pass) {
	send(password, pass);
}

}

