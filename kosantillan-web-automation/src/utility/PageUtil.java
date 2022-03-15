package utility;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtil {

	private static WebElement element = null;

	// public static Logger Log = Logger.getLogger(Logs.class.getName());

	// This method is to capture the screenshot and return the path of the
	// screenshot.
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {

		String dateName = new SimpleDateFormat("hhmmsssMMddyyyy").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) Constant.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "//Report//TestResult_" + Constant.TestCasename
				+ "//img-src//" + Constant.TestCasename + "_" + screenshotName + dateName + ".png";

		// custom screenshot for desktop capture
		if (screenshotName.equals("desktop")) {
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination.getAbsoluteFile());
			try {
				PageUtil.scrolltoElement(Constant.webElement);
			} catch (Exception e) {
			}
			// Robot r = new
			// Robot(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice());
			// BufferedImage capture = r.createScreenCapture(screenRect);
			// BufferedImage image = r.createScreenCapture(new
			// Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			// ImageIO.write(image, "png", new File(destination));
		} else {
			// this is for webpage capture
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination.getAbsoluteFile());
			Highlight(source, destination);
		}

		destination = ".\\img-src\\" + Constant.TestCasename + "_" + screenshotName + dateName + ".png";
		return destination;

	}

	public static WebElement GetElement(int Time, By By) {

		try {

			Constant.driver.manage().timeouts().setScriptTimeout(Time, TimeUnit.SECONDS);
			element = Constant.driver.findElement(By);
			WebDriverWait wait = new WebDriverWait(Constant.driver, Time);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By));
			Constant.currentLocator = By;
			scrolltoElement(element);
		} catch (Exception ex) {
			Constant.logger.fatal(ex);
			Constant.extent.flush();
			Constant.driver.quit();
		}

		return element;
	}

	public static void Highlight(File source, String destination) throws IOException {

		BufferedImage image = null;
		image = ImageIO.read(source);

		Graphics2D graphics = image.createGraphics();
		WebElement we = Constant.webElement;// Constant.driver.findElement(Constant.currentLocator);

		try {
			if (we.isDisplayed()) {
				int x = we.getLocation().getX();
				int y = we.getLocation().getY();
				int width = we.getSize().getWidth();
				int height = we.getSize().getHeight();

				graphics.setColor(Constant.highlightcolor);
				// Thickness of each side of the rectangle
				graphics.setStroke(new BasicStroke(7.0f));
				// To draw the rectangle around the element
				graphics.drawRect(x, y, width, height);

				ImageIO.write(image, "png", new File(destination));
			}
		} catch (Exception e) {
		}

	}

	public static void scrolltoElement(WebElement ScrolltoThisElement) {
		Coordinates coordinate = ((Locatable) ScrolltoThisElement).getCoordinates();
		coordinate.onPage();
		coordinate.inViewPort();
		Constant.webElement = ScrolltoThisElement;
	}

	public static void Select(By Locator, String value) {

		Select select = new Select(PageUtil.GetElement(10, Locator));
		select.selectByVisibleText(value);
	}

	public static WebElement GetWebTableElement(By Locator, String RowValue, int ColumnNumber) {

		List<WebElement> TotalRowCount = Constant.driver.findElements(Locator);
		int RowIndex = 1;
		for (WebElement rowElement : TotalRowCount) {
			if (rowElement.getText().contains(RowValue)) {
				Constant.currentLocator = By.xpath("//*[@id=\"content\"]/div/div/section/table/tbody/tr[" + RowIndex
						+ "]/td[" + ColumnNumber + "]/a");
				// Constant.currentLocator = By.xpath(Locator + "/tr[" +
				// RowIndex +"]/td[" + ColumnNumber +"]/a");
				element = PageUtil.GetElement(10, Constant.currentLocator);
				break;
			}
			RowIndex = RowIndex + 1;
		}
		return element;
	}

	public static String getXpath(WebElement Element) {
		String raw = Element.toString(); // xpath:
		int start = raw.indexOf("xpath: ");
		start = start + 7;
		int lastchar = raw.lastIndexOf("]");
		// int xpathlength = raw.length();
		// System.out.println(xpathlength);
		// System.out.println(start);System.out.println(raw.length());
		String extractedXpath = raw.substring(start, lastchar);
		// extractedXpath = extractedXpath.replace("\"","\\\"");
		// extractedXpath = "\"" +extractedXpath+ "\"";
		return extractedXpath;

	}

	/**
	 * Scroll until the specified element is visible on screen
	 * 
	 * @param driver
	 *            - driver
	 * @param elementBy
	 *            - element to be visible
	 */
	public static void scrollIntoView2(WebDriver driver, WebElement target) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView();", target);
		} catch (Exception e) {
			Constant.consoleLog.error("JavascriptExecutor ScrollIntoView failed: ", e);
		}
	}


}
