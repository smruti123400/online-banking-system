package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.myntra.com/libaskurta");
boolean logo = driver.findElement(By.xpath("(//h3[text()='Libas'])[1]/../div/span[1]/span[1]")).isDisplayed();
if(logo ==true) {
	System.out.println("logo is displayed and pass");
}
else {
	System.out.println("logo is not displayed and failed");
}
driver.close();
	}

}
