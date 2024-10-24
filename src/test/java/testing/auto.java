package testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testing.listnerdemo.class)
public class auto {

	

		static Logger logger=LogManager.getLogger(auto.class);
		static WebDriver driver;
		
		@Test
		public static void log() {
			

			 driver = new EdgeDriver();
			driver.get("https://demoqa.com/menu/");
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			WebElement second_menue = driver.findElement(By.linkText("Main Item 2"));
			act.moveToElement(second_menue);
			//act.build().perform();
			
			WebElement second_sub = driver.findElement(By.linkText("SUB SUB LIST »"));
			act.moveToElement(second_sub).perform();
			
			logger.info("Action completed");

	}

}
