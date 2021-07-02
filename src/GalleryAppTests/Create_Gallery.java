package GalleryAppTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Create_Gallery extends BaseTests {

	@Test(priority = 0)
	public void createGallery_OnePicture() {
		successfulLogin();
		mainNavigation.CreateGalleryButtonClick();
		create.titleField_Insert_Title("Dance");
		create.descriptionsField_Insert_Descriptions("Pictures of different Latino dances");
		create.imagesInputField_Insert_URL(
				"https://images.all-free-download.com/images/wallpapers_large/dancing_babes_3989.jpg");
		create.SubmitButtonClick();
		assertTrue(myGallery.getMyGallery_Dance().isDisplayed());

	}

}
