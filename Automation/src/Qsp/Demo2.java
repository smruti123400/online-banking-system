package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static
	{
		System.getProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		String title=driver1.getTitle();
		System.out.println(title);

	}

}
