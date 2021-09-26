package frame_handling_ways;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class FindIndexNumberofFrame extends DriverSetup {
	@Test
	public void IndexNumberofIFRAME() throws InterruptedException {

		// navigates to the page consisting an iframe

		driver.get("http://demo.automationtesting.in/Frames.html");
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		    int size = driver.findElements(By.tagName("iframe")).size();
		    System.out.println("Total Frames --" + size);
	               
			// prints the total number of frames 
			driver.switchTo().frame(0); // Switching the Outer Frame    		
		    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

			//Printing the text in outer frame
			size = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside outer frame           
	                                                                                                          
		    System.out.println("Total Frames --" + size);
		    driver.switchTo().frame(0); // Switching to innerframe
		    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
			
			//Printing the text in inner frame
			driver.switchTo().defaultContent();
		}
	}