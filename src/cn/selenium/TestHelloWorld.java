package cn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.baidu.com";
		System.setProperty("webdriver.firefox.bin", "D://Program Files (x86)//Mozilla firefox//firefox.exe"); 
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement box = driver.findElement(By.name("wd"));
		box.sendKeys("lol");
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		driver.close();
		
	}

}
