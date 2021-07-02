package GalleryAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGallery {

	WebDriver driver;

	public MyGallery(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebElement MyGallery_Dance;
	WebElement searchField;
	WebElement filterButton;
	WebElement titleString;
	WebElement authorString;

	public WebElement getFilterButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button"));
	}

	public WebElement getSearchField() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/input"));
	}

	public WebElement getMyGallery_Dance() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div"));
	}

	// Metode za klik

	public void filterButtonClick() {

		this.getFilterButton().click();
	}

	// Metode za popunu polja
	public void searchField_Input(String text) {
		this.getSearchField().clear();
		this.getSearchField().sendKeys(text);
	}

	// Metode za String

	public String TitleText() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/h2/a")).getText();
	}

	public String AuthorText() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/p/a")).getText();
	}
}
