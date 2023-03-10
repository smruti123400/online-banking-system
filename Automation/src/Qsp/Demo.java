package Qsp;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\achar\\OneDrive\\Desktop\\java\\javaprogram\\Automation\\driver\\chromedriver.exe");
ChromeDriver c = new ChromeDriver();
c.get("https://www.google.com");
String title=c.getTitle();
System.out.println(title);
c.close();


}
}
