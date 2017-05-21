package com.tests.mavenprojectexample;


import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StopwatchTest {

	@Test
	public void teststopwatch() {

	long starttime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "C:\\Automation3\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
	
		StopWatch s = new StopWatch();

		s.start();
		driver.get("http://www.bbc.co.uk");
		s.stop();

		System.out.println(s.getTime());

		
		System.out.println("Hello world");
		
	}

}
