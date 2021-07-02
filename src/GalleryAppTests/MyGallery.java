package GalleryAppTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MyGallery extends BaseTests {

	@Test(priority = 0)
	public void FindMyGallery() throws InterruptedException {
		successfulLogin();
		mainNavigation.MyGalleryButtonClick();
		Thread.sleep(2000);
		myGallery.searchField_Input("Dance");
		Thread.sleep(2000);
		myGallery.filterButtonClick();
		assertEquals( myGallery.TitleText(), "Dance");
		assertEquals(myGallery.AuthorText(), "Tara Ako");


	}
	
	
	
}
