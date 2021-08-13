package com.projecttestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {

	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement bmw = driver.findElement(By.id("bmwradio"));
		bmw.click();
		System.out.println("This is my first testcase1");

	}

}
