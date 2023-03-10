package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allsuggestion {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("java");
Thread.sleep(3000);
List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text()),'java']"));
int count = allsugg.size();
for (int i=0;count>i;i++) {
	String text = allsugg.get(i).getText();
	System.out.println(text);
}
allsugg.get(0).click();
	}

}
