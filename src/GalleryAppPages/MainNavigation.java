package GalleryAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {
	WebDriver driver;

	//driver konstruktor
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//Web elementi i getteri
	WebElement loginButton;
	WebElement logOutButton;
	WebElement createGalleryButton;
	WebElement myGalleryButton;
	WebElement logoutButton;
	

	public WebElement getLogoutButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]/a"));
	}

	public WebElement getMyGalleryButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a"));
	}

	public WebElement getCreateGalleryButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]/a"));
	}

	public WebElement getLogOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]/a"));
	}

	// Metode za klik
	public void LoginButtonClick() {
		this.getLoginButton().click();
	}

	public void CreateGalleryButtonClick() {
		this.getCreateGalleryButton().click();
	}
	public void MyGalleryButtonClick() {
		this.getMyGalleryButton().click();
	}

	public void LogoutButtonClick() {
		this.getLogoutButton().click();
	}


}
