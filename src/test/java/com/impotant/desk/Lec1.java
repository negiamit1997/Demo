package com.impotant.desk;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec1 {

	
	@Test
	public void firgprog() throws MalformedURLException, InterruptedException {
		
		
		
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver;
		
		
		 //String remoteurlchrome = "http://localhost:4445/wd/hub";
		
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(ChromeOptions.CAPABILITY,options);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		driver.get("https://www.lipsum.com/");
		//Thread.sleep(20000);
		
		
		
		
	}
	
	
}
