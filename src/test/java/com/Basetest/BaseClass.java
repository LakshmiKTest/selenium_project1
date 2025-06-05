package com.Basetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public Properties pr;

	@BeforeClass
	public void setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		pr = new Properties();

		FileInputStream file = new FileInputStream(
				"D:\\EclipseWorkSpace\\selenium_project1\\src\\test\\resources\\config.properties");
		pr.load(file);

		driver = new ChromeDriver();
		driver.get(pr.getProperty("url"));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	

	@AfterClass
	public void teardown() {
		driver.close();
	}

}
