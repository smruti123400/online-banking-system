package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyurlnavigation {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String expectedurl = ("https://www.selenium.dev/");
		String actualurl = driver.getCurrentUrl();
		if(actualurl.equals(expectedurl)) {
			System.out.println("yes");
		}
		else 
		{
			System.out.println("no");
		}

	}

}
