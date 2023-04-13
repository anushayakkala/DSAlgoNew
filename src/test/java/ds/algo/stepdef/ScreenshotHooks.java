package ds.algo.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ds.algo.commmon.BrowserDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class ScreenshotHooks {

	WebDriver driver = BrowserDriverManager.driverFactory();
	Logger logger = LogManager.getLogger();

	@After
	public void takeScreenshotOnFailure(Scenario scenario) {

		logger.info("<takeScreenshotOnFailure>: inside");
		if (scenario.isFailed()) {

			logger.info("<takeScreenshotOnFailure>: inside scenario.isFailed()");
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}

	}

}