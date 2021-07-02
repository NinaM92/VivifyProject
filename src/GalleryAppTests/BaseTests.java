package GalleryAppTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import GalleryAppPages.Create;
import GalleryAppPages.Login;
import GalleryAppPages.MainNavigation;
import GalleryAppPages.MyGallery;

public class BaseTests {

	WebDriver driver;	
	MainNavigation mainNavigation;
	Login login;
	Create create;
	MyGallery myGallery;

	// ExcelReader citacIzExcela;

	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		mainNavigation = new MainNavigation(driver);
		login = new Login(driver);
		create = new Create(driver);
		myGallery= new MyGallery(driver);
		
	}

	@BeforeMethod
	public void setup() {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
		

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	public void successfulLogin() {

		mainNavigation.LoginButtonClick();
		login.logIn("taraspasojevic@gmail.com", "password123");
	}

}
