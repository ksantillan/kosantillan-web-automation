package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagingPage {

	@FindBy(xpath="//a[contains(@href,'messaging')]")
	public static WebElement navMessaging;	
	
}
