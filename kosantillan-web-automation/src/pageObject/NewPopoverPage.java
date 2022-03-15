package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPopoverPage {

	
	@FindBy(xpath="//div[contains(@class,'StreetAddress')]")
	public static WebElement objNewPopoverLocation;	
	
}
