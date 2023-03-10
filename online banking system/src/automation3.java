import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automation3 {

	public static void main(String[] args) {
		
      WebDriver driver = new ChromeDriver();
      driver.get("http://rmgtestingserver/domain/Online_Banking_System/index.php");
     WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Internet Banking')]"));
Actions a=new Actions(driver);
a.moveToElement(target).perform();
driver.findElement(By.xpath("//li[contains(text(),'Login')]")).click();


driver.findElement(By.name("customer_id")).sendKeys("1011967");
driver.findElement(By.name("password")).sendKeys("0000000");
driver.findElement(By.name("login-btn")).click();

driver.findElement(By.xpath("//li[text()='Change Password']")).click();

driver.findElement(By.name("oldpass")).sendKeys("0000000");
driver.findElement(By.name("cnfrm")).sendKeys("0000000");
driver.findElement(By.name("newpass")).sendKeys("1234567");
driver.findElement(By.name("change_pass")).click();

Alert a1 = driver.switchTo().alert();
   a1.getText();
a1.accept();

driver.findElement(By.name("logout_btn")).click();

driver.findElement(By.name("customer_id")).sendKeys("1011967");
driver.findElement(By.name("password")).sendKeys("1234567");
driver.findElement(By.name("login-btn")).click();
}
}

