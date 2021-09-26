package frame_handling_ways;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class FrameHandlingbyID extends DriverSetup {
	
	@Test
	public void SwitchToFrameByID() throws InterruptedException {
		// navigates to the page consisting an iframe

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe"); // switching the frame by ID
		Thread.sleep(2000);

		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("In the frame");
		// Clicks the iframe
		Thread.sleep(2000);
		
		//Switch to parent
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	
	}
}
