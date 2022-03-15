package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EngineFaultsPage {

	@FindBy(xpath="//a[contains(@href,'fault/engine')]")
	public static WebElement navEngineFaults;	
	
}
