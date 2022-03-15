package utility;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verification {

	public static void verifyDisplayed(WebElement webElement, String ObjectName) {
		boolean isDisplayed = DoThis.isDisplayed(webElement, ObjectName);

		if (isDisplayed) {
			Reporter.ReportEventCustomStatus("[PASSED] " + ObjectName + " was displayed", "pass", "Y");
			return;
		}
		Reporter.ReportEventCustomStatus("[FAILED] " + ObjectName + " was not displayed", "fail", "Y");
		Assert.fail();
	}

	public static void verifyNotDisplayed(WebElement webElement, String ObjectName) {
		boolean isDisplayed = DoThis.isDisplayed(webElement, ObjectName);

		if (!isDisplayed) {
			Reporter.ReportEventCustomStatus("[PASSED] " + ObjectName + " was not displayed", "pass", "Y");
			return;
		}
		Reporter.ReportEventCustomStatus("[FAILED] " + ObjectName + " should not be displayed", "fail", "Y");
		Assert.fail();
	}

	public static void verifyTextBoxNotContainsValue(WebElement webElement, String ObjectName, String value) {
		boolean isContains = DoThis.getAttribute(webElement, "value").trim().contains(value.trim());

		if (!isContains) {
			Reporter.ReportEventCustomStatus("[PASSED] " + ObjectName + ": Correct value was displayed", "pass", "Y");
			return;
		}
		Reporter.ReportEventCustomStatus("[FAILED] " + ObjectName + ": Incorrect value was displayed: " + value, "fail",
				"Y");
		Assert.fail();
	}

	public static void verifyTextBoxContainsValue(WebElement webElement, String ObjectName, String value) {
		boolean isContains = DoThis.getAttribute(webElement, "value").trim().contains(value.trim());

		if (isContains) {
			Reporter.ReportEventCustomStatus("[PASSED] " + ObjectName + ": Correct value was displayed", "pass", "Y");
			return;
		}
		Reporter.ReportEventCustomStatus("[FAILED] " + ObjectName + ": Incorrect value was displayed: " + value, "fail",
				"Y");
		Assert.fail();
	}
}
