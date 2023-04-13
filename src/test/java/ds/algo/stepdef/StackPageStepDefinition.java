package ds.algo.stepdef;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ds.algo.commmon.AlertHandle;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.DataStructuresPageFactory;
import ds.algo.pagefactory.HomePageFactory;
import ds.algo.pagefactory.StackPageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StackPageStepDefinition {
	
	 WebDriver driver = BrowserDriverManager.driverFactory();
	 
	 StackPageFactory stackFactory = new StackPageFactory(driver);
	 HomePageFactory homePageFactory = new HomePageFactory(driver);
	 
	 DataStructuresPageFactory ds = new DataStructuresPageFactory(driver);
	 
	 Logger logger = LogManager.getLogger();
	 

	 @Given("User clicks on Get Started button in the Stack section on Home Page")
	 public void user_clicks_on_get_started_button_in_the_stack_section_on_home_page() {
		 homePageFactory.clickStackBtn();
	 }

	 @Then("Stack Data Structure page is displayed successfully")
	 public void stack_data_structure_page_is_displayed_successfully() {
        String actual = driver.findElement(By.xpath(" /html/body/div[2]/h4")).getText();
		 
		 Assert.assertEquals(actual, "Stack");
		 
		 logger.info("Stack page is displayed successfully");
		 
	 }

	 @Given("User clicks on Operations In Stack link")
	 public void user_clicks_on_operations_in_stack_link() {
		 stackFactory.clickOperationsinStackLink();
	  
	 }

	 @Given("Click on Try here button")
	 public void click_on_try_here_button() {
		 stackFactory.tryHereBtnClick();
	 }

	 @Given("User is navigated to the try Editor page")
	 public void user_is_navigated_to_the_try_editor_page() {
		String actualPage =  driver.getCurrentUrl();
		String expectedPage = "https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(actualPage, expectedPage);
		logger.info("User is navigated to try Editor page successfully");

	 }

	 @When("User enters valid python code in the text editor")
	 public void user_enters_valid_python_code_in_the_text_editor() throws InterruptedException {
		 ds.textArea();
		//driver.switchTo().activeElement().sendKeys("print 'hello'");

		Thread.sleep(1000);
	 }

	 @When("Clicks on Run button")
	 public void clicks_on_run_button() {
		 stackFactory.runBtnClick();
	 }

	 @Then("Output is be displayed successfully in the Run console")
	 public void output_is_be_displayed_successfully_in_the_run_console() {
		 
		 stackFactory.outputValidate();
		 
		 logger.info("Output is generated");
		 driver.navigate().back();
		 driver.navigate().back();
		 }

	 @When("User enters invalid python code in the text editor")
	 public void user_enters_invalid_python_code_in_the_text_editor() {
		 
		 //driver.switchTo().activeElement().sendKeys("invalidPythonCode");
		 
		 try {
			 Thread.sleep(1000);
			 ds.textArea1();
		 }
		 catch (Exception e) {
			    e.printStackTrace();
			   
		}
	   
	 }

	 @Then("Error alert is displayed")
	 public void error_alert_is_displayed() throws InterruptedException {
	 
		logger.info("Error alert is displayed");
		
		Thread.sleep(1000);
		
		AlertHandle.alerthandle();
		
		driver.navigate().refresh();
		 
	 }
 
	 @Given("User clicks on Implementation link")
	 public void user_clicks_on_implementation_link() {
		 stackFactory.clickImplementationLink();
	  
	 }
	 
	 @Given("User clicks on Applications link")
	 public void user_clicks_on_applications_link() {
		 stackFactory.clickApplicationsLink();
	  
	 }
	 
	 @When("User clicks on NumpyNinja brand logo displayed on the page")
	 public void user_clicks_on_numpy_ninja_brand_logo_displayed_on_the_page() {
		 homePageFactory.clickbrandLogo();
	 
	 }

	 @Then("DSAlgo launch page is displayed")
	 public void ds_algo_launch_page_is_displayed() {
		 String actualHeading = driver.findElement(By.tagName("h1")).getText();
		 
		 Assert.assertEquals(actualHeading, "Preparing for the Interviews");
		 
		 homePageFactory.clickStartButton();
		 
	
	 }
	  
	 
}