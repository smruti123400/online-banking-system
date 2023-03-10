package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/achar/OneDrive/Desktop/menu.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Select s =new Select(mtrlistbox);
List<WebElement> alloptions = s.getOptions();
for(WebElement option:alloptions) {
	String text = option.getText();
	System.out.println(text);
}
driver.close();
	}

}
