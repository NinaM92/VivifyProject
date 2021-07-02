package GalleryAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	WebElement emailField;
	WebElement passwordField;
	WebElement submitButton;
	

	

	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}


	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}


	public WebElement getSubmitButton() {
		return driver.findElement(By.cssSelector(".btn.btn-custom"));
	}
	
	
	//Metoda za log in
	
   public void logIn (String email, String password) {
	  this.getEmailField() .clear();
	  this.getEmailField().sendKeys(email);
	  this.getPasswordField().clear();
	  this.getPasswordField().sendKeys(password);
	  this.getSubmitButton().click();
	   
   }
	
	
}
