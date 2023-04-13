package ds.algo.commmon;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriverManager {

    public static WebDriver driver;
    public static ChromeOptions options;

    private BrowserDriverManager() {
    }

    public static WebDriver driverFactory() {
	if (driver == null) {

	    if (ConfigFileReader.launchBrowser().equalsIgnoreCase("Chrome")) {

		WebDriverManager.chromedriver().setup();

		options = new ChromeOptions();
		options.addArguments("--start-maximized");

		driver = new ChromeDriver(options);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://dsportalapp.herokuapp.com/login");
	    }

	    
	    
	    if (ConfigFileReader.launchBrowser().equalsIgnoreCase("firefox")) {

		WebDriverManager.firefoxdriver().setup();
	    //	System.setProperty("webdriver.gecko.driver", "D:\\selenium\\workspace\\DSAlgoNew\\src\\main\\resources\\Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1920,1080));
	    }

	 //   return driver;

	

    
    if (ConfigFileReader.launchBrowser().equalsIgnoreCase("edge")) {

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	    }

	    return driver;

	} else 
	
		return driver;
	    
	
    }

}

