package ds.algo.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArraysPageFactory {
WebDriver driver;
@FindBy(xpath="/html/body/div[3]/div[2]/div/div/a")
WebElement agetstarted;

@FindBy(linkText="Arrays in Python")
WebElement arraypytn;

@FindBy(linkText="Try here>>>")
WebElement atryhere;

@FindBy(xpath="//form/div/div/div/textarea")
WebElement atextarea;

@FindBy(xpath="//button[@type='button']")
WebElement arun;

@FindBy(linkText="Arrays Using List")
WebElement arraylist;

@FindBy(linkText="Basic Operations in Lists")
WebElement basic;

@FindBy(linkText="Applications of Array")
WebElement app;

public ArraysPageFactory(WebDriver d) {
	this.driver=d;
	PageFactory.initElements(d, this);
}
public void aGetStartedClick() {
	agetstarted.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)", "");
}
public void arrayPython() {
	arraypytn.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)", "");
}

public void atryHere() {
	atryhere.click();
}

public void aTextArea() {
	atextarea.sendKeys("print 'Arrays in python'");
}

public void aTextArea1() {
	atextarea.sendKeys("print i am on Array page");
}

public void arRun() {
	arun.click();
	
	//driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
}
public void arrayList() {
	arraylist.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
}
public void basicOperation() {
	basic.click();
}
public void appOfArray() {
	app.click();
}

}