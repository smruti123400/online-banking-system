package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createnewacnt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(2000);
int y = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
int y1 = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
int y2 = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
if( y== y1&& y1==y2){
	System.out.println("alignede and pass");
}
else {
	System.out.println("not alligned and fail");
}
driver.close();
	}

}
