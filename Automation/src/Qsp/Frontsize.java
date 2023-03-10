package Qsp;

import java.awt.Font;

import javax.swing.text.StyledEditorKit.FontSizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frontsize {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 Object fontsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		System.out.println(fontsize);
driver.close();
	}



	

}
