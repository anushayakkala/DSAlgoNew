package ds.algo.pagefactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreePageFactory {
	 WebDriver driver;
		
		@FindBy(xpath="/html/body/div[2]/div[6]//a")
		WebElement getstartedBtnTreePage;
		
		@FindBy(linkText="Overview of Trees")
		WebElement overviewofTrees;
		
		@FindBy(linkText="Terminologies")
		WebElement terminologies;
		
		@FindBy(linkText="Types of Trees")
		WebElement typesofTrees;
		
		@FindBy(linkText="Tree Traversals")
		WebElement treeTraversals;
		
		@FindBy(linkText="Traversals-Illustration")
		WebElement traversalsIllustration;
		
		@FindBy(linkText="Binary Trees")
		WebElement binaryTrees;
		
		@FindBy(linkText="Types of Binary Trees")
		WebElement typesofBinaryTrees;
		
		@FindBy(linkText="Implementation in Python")
		WebElement implementationinPythn;
		
		@FindBy(linkText="Binary Tree Traversals")
		WebElement binaryTreeTraversals;
		
		@FindBy(linkText="Implementation of Binary Trees")
		WebElement implementationofBinaryTrees;
		
		@FindBy(linkText="Applications of Binary trees")
		WebElement applicationsofBinarytrees;
		
		@FindBy(linkText="Binary Search Trees")
		WebElement binarySearchTrees;
		
		@FindBy(linkText="Implementation Of BST")
		WebElement implementationOfBST;
		
		@FindBy(linkText="Practice Questions")
		WebElement practiseQuestion;
	   
		@FindBy(xpath="/html/body/div[2]/div/div[2]/a")
		WebElement tryHereBtn;
		
		@FindBy(xpath="//form/div/div/div/textarea")
		WebElement tryeditorInputCode;
		
		@FindBy(xpath="//form//button[@type='button']")
		WebElement runBtn;
		
		@FindBy(xpath="//pre[@id='output']")
		WebElement runOutputTextArea;
		
		@FindBy(id="alertButton")	
		WebElement alertBtn;
			
	    public TreePageFactory(WebDriver d) {
		this.driver = d;
		
		PageFactory.initElements(d, this);
	    }
	    
	    
		public void clickGetsrtdBtnTreePage() {
			getstartedBtnTreePage.click();
				
		}
					 
		public void clickOverviewofTrees() {
					
			overviewofTrees.click();
			
		}

		public void clickTerminologies() {
			
			terminologies.click();
			
		}
		
		public void clicktypesofTrees() {
			typesofTrees.click();
		
		}

	public void clickTreeTraversals() {
			
		treeTraversals.click();
		}


	public void clickTraversalsIllustration() {
			
		traversalsIllustration.click();
		}


	public void clickBinaryTrees() {
			
		binaryTrees.click();
		}


	public void clickTypesofBinaryTrees() {
			
		typesofBinaryTrees.click();
		}


	public void clickImplementationinPythn() {
			
		implementationinPythn.click();
		}

	public void clickBinaryTreeTraversals() {
		
		binaryTreeTraversals.click();
		}

	public void clickImplementationofBinaryTrees() {
		
		implementationofBinaryTrees.click();
		}


	public void clickApplicationsofBinarytrees() {
		
		applicationsofBinarytrees.click();
		}


	public void clickBinarySearchTrees() {
		
		binarySearchTrees.click();
		}

	public void clickImplementationOfBST() {
		
		implementationOfBST.click();
		}

	public void clickTryHereBtn() {
		tryHereBtn.click();
	}

	public void ClickPractiseQstnLink() {
		
		practiseQuestion.click();
		}


	public void ClickAlertBtn() {
		
//		   JavascriptExecutor js=(JavascriptExecutor)driver;
//		   js.executeScript("arguments[0].click()",alertBtn);
		
		    alertBtn.click();
		}
	  public void clickrunBtn() throws Exception {
		  
		           JavascriptExecutor js=(JavascriptExecutor)driver;
					//js.executeScript("window.scrollBy(0,250)");
					 js.executeScript("arguments[0].click()",runBtn);
					
	  }
		
	  public void enterCodeinEditor(String s) {
		  
		   	  tryeditorInputCode.sendKeys(s);
		   	 
	  }
	  public String runOutputTextArea() {
		   
		   return(runOutputTextArea.getText());
	  }


}