package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutget {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.navigate().to("https://www.facebook.com");
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.close();
	}

}
