package GalleryAppTests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Log_In extends BaseTests {

	@Test(priority = 0)
	public void successfulLogin () {
      mainNavigation.LoginButtonClick();
      login.logIn("taraspasojevic@gmail.com", "password123");		
      assertTrue(mainNavigation.getLogOutButton().isDisplayed());
	}
	
	
}
