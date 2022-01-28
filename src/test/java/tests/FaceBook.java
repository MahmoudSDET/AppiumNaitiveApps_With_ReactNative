package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class FaceBook  extends TestBase11{
	
	
	
	 @Test(priority = 1)
	    public  void Scenarion_1_Test() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Username").sendKeys("ma681837@gmail.com");
		driver.findElementByAccessibilityId("Password").sendKeys("0121104980801159798860");
		driver.findElementByAccessibilityId("Log In").click();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.view.View[contains(@content-desc,'Notifications')]").click();
		 driver.findElementByXPath("//android.view.ViewGroup[@index='2']").click();
		 		
		
	/*	 
		 Set<String> contexts = driver.getContextHandles();
		 System.out.println(contexts.size());
		 for(String context : contexts){
		 System.out.println(context);
		 }
		 //NATIVE_APP
		 //WEBVIEW_1
		
		 driver.context("WEBVIEW_1");
		 driver.get("http://google.co.in");
		 driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("test");
		 driver.findElementByXPath("//*[@id='tsbb']").click();

*/

	    }

}
