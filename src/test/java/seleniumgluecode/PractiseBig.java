package seleniumgluecode;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class PractiseBig {
	public static void main(String[] args) {
	System.out.print("Test");
	}
	/**static	List<WebElement>  text(WebDriver d,String purl) {
		 d.get(purl);
		List<WebElement>  time= d.findElements(By.tagName("input")); 
		// To find particular element use xpath //input[@id='firstName'] and contain //input[contains(@type,'text')]
		 for(int i = 0; i< time.size(); i++) {
			 String s = time.get(i).getAttribute("type");
	    	 if (!s.contains("text")) {	    		
	    		 return time;
	      } 
		 }	 
		return null;
		}
	    
	public static void main(String[] args) {
		WebDriver d = new HtmlUnitDriver();	
String purl = "file:///C:/Users/himanshub/Desktop/Test.html";
System.out.print(text(d,purl));
	}	**/
}

