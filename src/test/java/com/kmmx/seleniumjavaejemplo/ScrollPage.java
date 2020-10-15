package com.kmmx.seleniumjavaejemplo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com");
	}
	
	@Test
	public void scrollJavaPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,10000)");
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}
