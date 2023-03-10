import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class automation4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		  WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Internet Banking')]"));
	      Actions ac=new Actions(driver);
	          ac.moveToElement(resources).perform();
	          driver.findElement(By.xpath("//li[contains(text()='Login')]")).click();
	          
	          driver.findElement(By.name("customer_id")).sendKeys("1011967");
	          driver.findElement(By.name("password")).sendKeys("1234567");
	          driver.findElement(By.name("login-btn")).click();
	          
	          driver.findElement(By.xpath("//li[text()='Fund Transfer']")).click();
	          
	          driver.findElement(By.name("add_beneficiary")).click();
	          
	          driver.findElement(By.name("beneficiary_name")).sendKeys("sra");
	          driver.findElement(By.name("beneficiary_acno")).sendKeys("1011221011830");
	          driver.findElement(By.name("Ifsc_code")).sendKeys("1011");
	          WebElement accountype = driver.findElement(By.name("acctype"));
              Select s= new Select(accountype);
              s.selectByValue("Saving");
              
              driver.findElement(By.name("add_beneficiary_btn")).click();
              
           Alert a = driver.switchTo().alert();
                   a.accept();
                   
           driver.findElement(By.xpath("//li[text()='Fund Transfer']")).click();
            WebElement drop = driver.findElement(By.name("beneficiary"));                  
           Select s1= new Select(drop);
           s1.selectByValue("1011221011830");
           driver.findElement(By.name("trnsf_amount")).sendKeys("500");
           driver.findElement(By.name("fnd_trns_btn")).click();
                     
            driver.findElement(By.id("logout")).click();
            driver.close();

	}

}
