import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automation2 {
private static final TimeUnit TimeUnit = null;

static
{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args)  {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		 driver.findElement(By.xpath("//li[text()='Apply Debit Card']")).click();
		 
		 driver.findElement(By.name("holder_name")).sendKeys("deepak");
		 
		driver.findElement(By.name("dob")).click();
		
	driver .findElement(By.name("dob")).sendKeys("01-01-2000");
		 driver.findElement(By.name("pan")).sendKeys("qwerty");
		 
		 driver.findElement(By.name("mob")).sendKeys("9012345678");
		
		 driver.findElement(By.name("acc_no")).sendKeys("1011481011967");
		 
		 driver.findElement(By.name("dbt_crd_submit")).click();
		 
		 Alert a = driver.switchTo().alert();
		 a.accept();
		
		 driver.findElement(By.xpath("//a[text()='Home']")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Staff Login']")).click();

		 driver.findElement(By.name("staff_id")).sendKeys("210001");
		 driver.findElement(By.name("password")).sendKeys("password");
		 
		 driver.findElement(By.name("staff_login-btn")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Home']")).click();
		 
		 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Internet Banking')]"));
		 Actions a1 =new Actions(driver);
		 a1.moveToElement(target).perform();
		
		 driver.findElement(By.xpath("//li[text()='Register']")).click();
		 driver.findElement(By.name("holder_name")).sendKeys(" deepak");
		 driver.findElement(By.name("accnum")).sendKeys("1011481011967");
		 driver.findElement(By.name("dbtcard")).sendKeys("421378375744");
		 driver.findElement(By.name("dbtpin")).sendKeys("5310");
		 driver.findElement(By.name("mobile")).sendKeys("9012345678");
		 driver.findElement(By.name("pan_no")).sendKeys("qwerty");
		 driver.findElement(By.name("dob")).click();
		 driver.findElement(By.name("dob")).sendKeys("01012000");
		 driver.findElement(By.name("last_trans")).sendKeys("0");
		 driver.findElement(By.name("password")).sendKeys("0000000");
		 driver.findElement(By.name("cnfrm_password")).sendKeys("0000000");
		 driver.findElement(By.name("submit")).click();
		 Alert a2 = driver.switchTo().alert();
         a2.accept();
         
         driver.findElement(By.linkText("Home")).click();
         
         Actions ac1=new Actions(driver);
         
		ac1.moveToElement(target).perform();
         
         driver.findElement(By.xpath("//li[contains(text()='Login')]")).click();
         
         driver.findElement(By.name("customer_id")).sendKeys("1011967");
         driver.findElement(By.name("password")).sendKeys("0000000");
         driver.findElement(By.name("login-btn")).click();
         
         driver.findElement(By.xpath("//li[text()='Statement']")).click();
         
         driver.findElement(By.id("logout")).click();
         
        driver.close();
		 
		 
		 
	}

}
