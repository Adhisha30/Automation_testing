package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class listnerdemo implements ITestListener {
	
	
	
	
public void onTestFailure(ITestResult arg0) {
		
	
	File image1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		Files.copy(image1, new File("C:\\Users\\athir\\Desktop\\demoScreen\\1.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	   
		
	}

}
