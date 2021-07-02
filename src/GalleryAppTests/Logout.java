package GalleryAppTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Logout extends BaseTests {

	@Test(priority = 0)
	public void FindMyGallery() throws InterruptedException {
		successfulLogin();
		Thread.sleep(2000);
		mainNavigation.LogoutButtonClick();
		Thread.sleep(2000);
		assertTrue(mainNavigation.getLoginButton().isDisplayed());
		


	}
}
