package frame_handling_ways;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FrameHandlingbyWebElement extends DriverSetup {
	@Test
	public void SwitchToFrameByIndex() throws InterruptedException {
		// navigates to the page consisting an iframe

		driver.get("http://demo.automationtesting.in/Frames.html");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames" + size);

		// Find iframe using Web Element
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(myFrame);
		Thread.sleep(2000);

		// Send value in search boxs
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("In the frame");
		Thread.sleep(2000);

		// Switch to parent
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[2]/a[1]")).click();
		Thread.sleep(2000);

		driver.close();

	}
}