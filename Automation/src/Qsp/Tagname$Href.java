package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname$Href {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
String tag = driver.findElement(By.id("topasswordrecoverypagelink")).getTagName();
System.out.println(tag);
String attribute = driver.findElement(By.id("topasswordrecoverypagelink")).getAttribute("href");
System.out.println(attribute);
driver.close();
	}

}
