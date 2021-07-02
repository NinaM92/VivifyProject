package GalleryAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create {

	
	

	WebDriver driver;
	public Create(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	WebElement titleField;
	WebElement desriptionsField;
	WebElement imagesInputField;
	WebElement addImagesButton;
	WebElement submitButton;
	
	
	
	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[1]"));
	}

	public WebElement getAddImagesButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
	}

	public WebElement getImagesInputField() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/input"));
	}

	public WebElement getTitleField() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDesriptionsField() {
		return driver.findElement(By.id("description"));
	}
	
	//Metode za klik
	public void addImagesButtonClick() {
		this.getAddImagesButton().click();
	}
	public void SubmitButtonClick() {
		this.getSubmitButton().click();
	}

	// Metode za popunu polja

	public void titleField_Insert_Title(String title) {
		this.getTitleField().clear();
		this.getTitleField().sendKeys(title);
	}

	public void descriptionsField_Insert_Descriptions(String descriptions) {
		this.getDesriptionsField().clear();
		this.getDesriptionsField().sendKeys(descriptions);
	}

	public void imagesInputField_Insert_URL(String URL) {
		this.getImagesInputField().clear();
		this.getImagesInputField().sendKeys(URL);

	}
	
	
}
