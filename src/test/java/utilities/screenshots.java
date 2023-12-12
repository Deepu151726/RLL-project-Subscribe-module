/*package utilities;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import steps.BaseTest;



public class screenshots {

public static String takesScreenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver ;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/myscreenshot.png");   //_"+System.currentTimeMillis()+"
		 
		 FileUtils.copyFile(srcFile, destFile);
		 
		 String targetpath = destFile.getAbsolutePath();
		 return targetpath;
	}
}*/