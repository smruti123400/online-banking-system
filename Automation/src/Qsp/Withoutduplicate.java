package Qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Withoutduplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/achar/OneDrive/Desktop/menu.html");
WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Select s= new Select(mtrlistbox );
List<WebElement> alloptions = s.getOptions();
for(int i=0;i<alloptions.size();i++) {
	String text = alloptions.get(i).getText();
	hs.add(text);
	}
for(String option:hs) {
	System.out.println(option);
}
driver.close();
}
}
