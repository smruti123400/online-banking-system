package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
static{
	System.setProperty("webdriver.chrome.driver.", "./chromedriver/driver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.id("toPasswordRecoverPage")).getText();
System.out.println(text);
driver.close();
	}

}
