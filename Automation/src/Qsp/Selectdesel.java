package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdesel {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/achar/OneDrive/Desktop/menu.html");
WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Select s =new Select(mtrlistbox);
List<WebElement> alloptions = s.getOptions();
for(int i=0;i<alloptions.size();i++) {
	s.selectByIndex(i);
	Thread.sleep(5000);
}
for (int i=alloptions.size()-1;i>=0;i--) {
	s.deselectByIndex(i);
	Thread.sleep(5000);
	}
driver.close();
	}

}
