package org.tester.login;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\COM\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
WebElement con = driver.findElement(By.id("continentsmultiple"));
Select s=new driver(con);
System.out.println("123");
}
}
