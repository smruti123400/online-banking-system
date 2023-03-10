package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
 WebElement E = driver.findElement(By.className("_396cs4"));
 E.click();
}
}
