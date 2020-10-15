package com.kmmx.seleniumjavaejemplo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class WikiBeta {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jairamezcua.github.io/Pelicula/index.html");
	}
	
	@Test
	public void buscaMar() {
		WebElement searchbox = driver.findElement(By.id("searchterm"));
		searchbox.clear();
		searchbox.sendKeys("mar");;
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertFalse(driver.findElement(By.id("tr0td2")).equals("Mar"));
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	}
	
	@Test
	public void buscaPinkFloyd() {
		WebElement searchbox = driver.findElement(By.id("searchterm"));
		searchbox.clear();
		searchbox.sendKeys("pink floyd");;
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertFalse(driver.findElement(By.id("tr0td2")).equals("Pink Floyd"));
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	}
	
	@Test
	public void buscaInformatica() {
		WebElement searchbox = driver.findElement(By.id("searchterm"));
		searchbox.clear();
		searchbox.sendKeys("informatica");;
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertFalse(driver.findElement(By.id("tr0td1")).equals("1814033"));
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
