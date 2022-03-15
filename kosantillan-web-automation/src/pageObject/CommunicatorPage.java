package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunicatorPage {

	@FindBy(xpath="//a[@id='DELIVERY']")
	public static WebElement navDelivery;	
	
}
