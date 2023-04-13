package ds.algo.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.HomePageFactory;
import ds.algo.pagefactory.QueuePageFactory;
import ds.algo.pagefactory.StackPageFactory;
import io.cucumber.java.en.*;

public class QueuePageStepDefinition {
	
	WebDriver driver = BrowserDriverManager.driverFactory();
	 
	 StackPageFactory stackFactory = new StackPageFactory(driver);
	 HomePageFactory homePageFactory = new HomePageFactory(driver);
	 
	 QueuePageFactory queueFactory = new QueuePageFactory(driver);
	 
	 Logger logger = LogManager.getLogger();
	 
	 
	 @Given("User clicks on Get Started button in the Queue section on Home Page")
	 public void user_clicks_on_get_started_button_in_the_queue_section_on_home_page() {
		 homePageFactory.clickQueueBtn();
	 }

	 @Then("Queue Data Structure page is displayed successfully")
	 public void queue_data_structure_page_is_displayed_successfully() {
		 String actual = driver.findElement(By.xpath(" /html/body/div[2]/h4")).getText();
         Assert.assertEquals(actual, "Queue");
		 
		 logger.info("Queue page is displayed successfully");
	 }

	 @Given("User clicks on Implementation of Queue in Python link")
	 public void user_clicks_on_implementation_of_queue_in_python_link() {
		 queueFactory.clickImplementQueueLink();
	
	 }
	 
	 @Given("User clicks on Implementation using collections.deque link")
	 public void user_clicks_on_implementation_using_collections_deque_link() {
		 queueFactory.clickImpUsingCllctnLink();
	 }

	 @Given("User clicks on Implementation using array link")
	 public void user_clicks_on_implementation_using_array_link() {
		 queueFactory.clickImpUsingArrayLink();
	 }

	 @Given("User clicks on Queue Operations link")
	 public void user_clicks_on_queue_operations_link() {
		 queueFactory.clickQueueOperations();
	 }


}