package ds.algo.stepdef;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.openqa.selenium.Alert;

import ds.algo.commmon.AlertHandle;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.commmon.ConfigFileReader;
import ds.algo.pagefactory.HomePageFactory;
import ds.algo.pagefactory.RegistrationPageFactory;
import ds.algo.pagefactory.TreePageFactory;
import io.cucumber.java.en.*;

public class TreePageStepDefinition {
	
	WebDriver driver = BrowserDriverManager.driverFactory();

	HomePageFactory homePageFactory = new HomePageFactory(driver);

	TreePageFactory treePageFactory = new TreePageFactory(driver);

	Logger logger = LogManager.getLogger();
    
	@Then("Tree HomePage should be displayed")
	public void tree_home_page_should_be_displayed() {
		String expectedTreePageTitle = "Tree";

		String actualTreePageTitle = driver.getTitle();

		Assert.assertEquals(actualTreePageTitle, expectedTreePageTitle);

		System.out.println("Tree Home is successfully displayed" + actualTreePageTitle);
		logger.info("Tree HomePage should be displayed");

	}
	
	@Given("User click on the Overview of Trees link")
	public void user_click_on_the_overview_of_trees_link() throws InterruptedException {
				treePageFactory.clickOverviewofTrees();
				Thread.sleep(1000);
	}

	@Then("Overview of Trees page should be displayed")
	public void overview_of_trees_page_should_be_displayed() {

		String expectedTreePage1Title = "Overview of Trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Overview of Trees page is displayed");
		
	}

	
	@When("User click the Try Here>> button in Tree Page")
	public void user_click_the_try_here_button_in_tree_page() throws InterruptedException {
		treePageFactory.clickTryHereBtn();
		Thread.sleep(1000);
	}

	@Then("User able to see the Page having a TryEditor with the Run Button to test")
	public void user_able_to_see_the_page_having_a_try_editor_with_the_run_button_to_test() {

		String expectedTreePage2Title = "Assessment";

		String actualTreePage2Title = driver.getTitle();

		Assert.assertEquals(actualTreePage2Title, expectedTreePage2Title);

		System.out.println(actualTreePage2Title);
		logger.info("Page having a TryEditor with the Run Button to test is displayed");
		
	}

	@And("User click on the Run button")
	public void user_click_on_the_run_button() throws Exception {
		
		treePageFactory.clickrunBtn();
		
	}

	@Then("User enters valid Python code in the Editor")
	public void user_enters_valid_python_code_in_the_editor() throws InterruptedException {

		String python = "print('Welcome to Python')";

		treePageFactory.enterCodeinEditor(python);
		

	}
	
	@Then("User should get correct Run Output")
	public void user_should_get_correct_run_output() throws InterruptedException {

		String expectedOutput1 = "Welcome to Python";

		String actualOutput = treePageFactory.runOutputTextArea();

		Assert.assertEquals(actualOutput, expectedOutput1);

		System.out.println(actualOutput);

		logger.info("Python code is successfully executed with correct output");
		driver.navigate().refresh();
		driver.navigate().back();
	
		
	}
	
	@Given("User click on the Terminologies link")
	public void user_click_on_the_terminologies_link() throws InterruptedException {
		
		treePageFactory.clickTerminologies();
		Thread.sleep(1000);
	}

	@Then("Terminologies page should be displayed")
	public void terminologies_page_should_be_displayed() {
		String expectedTreePage1Title = "Terminologies";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Terminologies page is displayed");
		
	}
		

	@When("User enters invalid Python code in the Editor")
	public void user_enters_invalid_python_code_in_the_editor() throws InterruptedException {
		
		String python2 = "print(Welcome to Python";
       
		treePageFactory.enterCodeinEditor(python2);
	
	}

		
	@Then("User should get error message")
	public void user_should_get_error_message() {

		//logger.info("Python code was not executed with correct output");
      //  driver.switchTo().alert().accept();
		
		//treePageFactory.ClickAlertBtn();
		
		
		//Alert simpleAlert = driver.switchTo().alert();
		//simpleAlert.accept();
		
		//String ErrorMsg = simpleAlert.getText();
	//System.out.println("The code is wrong");
	//	System.out.println(ErrorMsg);
		//logger.info("Python code was not executed with correct output");
	//	driver.navigate().refresh();
		AlertHandle.alerthandle();
		driver.navigate().refresh();
		driver.navigate().back();
		
                 
	}
	
	
	@Given("User click on the Types of Trees link")
	public void user_click_on_the_types_of_trees_link() throws InterruptedException {
		treePageFactory.clicktypesofTrees();
		Thread.sleep(1000);
	}

	@Then("Types of Trees page should be displayed")
	public void types_of_trees_page_should_be_displayed() {
		
		String expectedTreePage1Title = "Types of Trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Types of Trees page is  displayed");
		 
	}

	@Given("User click on the Tree Traversals link")
	public void user_click_on_the_tree_traversals_link() throws InterruptedException {
		treePageFactory.clickTreeTraversals();
		Thread.sleep(1000);
	}

	@Then("Tree Traversals page should be displayed")
	public void tree_traversals_page_should_be_displayed() {
		
		String expectedTreePage1Title = "Tree Traversals";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Tree Traversals page is displayed");
	}

	@Given("User click on the Traversals-Illustration link")
	public void user_click_on_the_traversals_illustration_link() throws InterruptedException {
		treePageFactory.clickTraversalsIllustration();
		Thread.sleep(1000);
	}

	@Then("Traversals-Illustration page should be displayed")
	public void traversals_illustration_page_should_be_displayed() {
		String expectedTreePage1Title = "Traversals-Illustration";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Traversals-Illustration page is  displayed");
		
	}

	@Given("User click on the Binary Trees link")
	public void user_click_on_the_binary_trees_link() throws InterruptedException {
		treePageFactory.clickBinaryTrees();
		Thread.sleep(1000);
	}

	
	@Then("Binary Trees page should be displayed")
	public void binary_trees_page_should_be_displayed() {
	
		String expectedTreePage1Title = "Binary Trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Binary Trees page is  displayed");
		
	}

	@Given("User click on the Types of Binary Trees link")
	public void user_click_on_the_types_of_binary_trees_link() throws InterruptedException {
		treePageFactory.clickTypesofBinaryTrees();
		Thread.sleep(1000);
		
	}

	@Then("Types of Binary Trees page should be displayed")
	public void types_of_binary_trees_page_should_be_displayed() {
	
		String expectedTreePage1Title = "Types of Binary Trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Types of Binary Trees page is displayed");
		  
	}
	
	@Given("User click on the Implementation in Python link")
	public void user_click_on_the_implementation_in_python_link() throws InterruptedException {
		treePageFactory.clickImplementationinPythn();
		Thread.sleep(1000);
	}

	@Then("Implementation in Python page should be displayed")
	public void implementation_in_python_page_should_be_displayed() {
		String expectedTreePage1Title = "Implementation in Python";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Implementation in Python page is displayed");
		 	   
	}

	@Given("User click on the Binary Tree Traversals link")
	public void user_click_on_the_binary_tree_traversals_link() throws InterruptedException {
		treePageFactory.clickBinaryTreeTraversals();
		Thread.sleep(1000);
	}

	@Then("Binary Tree Traversals page should be displayed")
	public void binary_tree_traversals_page_should_be_displayed() {
	 
		
		String expectedTreePage1Title = "Binary Tree Traversals";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Binary Tree Traversals page is displayed");
		
	}

	@Given("User click on the Implementation of Binary Trees link")
	public void user_click_on_the_implementation_of_binary_trees_link() throws InterruptedException {
		treePageFactory.clickImplementationofBinaryTrees();
		Thread.sleep(1000);
	}

	@Then("Implementation of Binary Trees page should be displayed")
	public void implementation_of_binary_trees_page_should_be_displayed() {
	  
		
		String expectedTreePage1Title = "Implementation of Binary Trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Implementation of Binary Trees page is displayed");
		 
	}

	@Given("User click on the Applications of Binary trees link")
	public void user_click_on_the_applications_of_binary_trees_link() throws InterruptedException {
		treePageFactory.clickApplicationsofBinarytrees();
		Thread.sleep(1000);
		
	}

	@Then("Applications of Binary trees page should be displayed")
	public void applications_of_binary_trees_page_should_be_displayed() {
	   
		String expectedTreePage1Title = "Applications of Binary trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Applications of Binary trees page is displayed");
		 
	}

	@Given("User click on the Binary Search Trees link")
	public void user_click_on_the_binary_search_trees_link() throws InterruptedException {
		treePageFactory.clickBinarySearchTrees();
		Thread.sleep(1000);
	}

	@Then("Binary Search Trees page should be displayed")
	public void binary_search_trees_page_should_be_displayed() {
	
		String expectedTreePage1Title = "Binary Search Trees";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Binary Search Trees page is displayed");
		 
	}

	@Given("User click on the Implementation Of BST link")
	public void user_click_on_the_implementation_of_bst_link() throws InterruptedException {
		treePageFactory.clickImplementationOfBST();
		Thread.sleep(1000);
	
	}

	@Then("Implementation Of BST page should be displayed")
	public void implementation_of_bst_page_should_be_displayed() {
		
		String expectedTreePage1Title = "Implementation Of BST";

		String actualTreePage1Title = driver.getTitle();

		//treePageFactory.clickGetsrtdBtnTreePage();
		Assert.assertEquals(actualTreePage1Title, expectedTreePage1Title);

		System.out.println(actualTreePage1Title);
		logger.info("Implementation Of BST page is displayed");
	
	}


}