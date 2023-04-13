package ds.algo.commmon;

public class AlertHandle {
	
	public static void alerthandle() {
		
	
	BrowserDriverManager.driver.switchTo().alert().accept();

}
}