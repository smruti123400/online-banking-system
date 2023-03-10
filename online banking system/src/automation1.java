import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automation1 {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		driver.findElement(By.name("name")).sendKeys("deepak");
		driver.findElement(By.name("gender")).sendKeys("male");
		driver.findElement(By.name("mobile")).sendKeys("9012345678");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("landline")).sendKeys("123456");
		driver.findElement(By.name("dob")).click();
		driver.findElement(By.name("dob")).sendKeys("01012000");
		driver.findElement(By.name("pan_no")).sendKeys("qwerty");
		driver.findElement(By.name("citizenship")).sendKeys("123");
		driver.findElement(By.name("homeaddrs")).sendKeys("bangalore");
		driver.findElement(By.name("officeaddrs")).sendKeys("bangalore");
		WebElement state = driver.findElement(By.name("state"));
		Select s= new Select(state);
		s.selectByValue("California");
		WebElement city = driver.findElement(By.name("city"));
		Select s2 = new Select(city);
        s2.selectByValue("Texas City");
        driver.findElement(org.openqa.selenium.By.name("pin")).sendKeys("561234");
        driver.findElement(By.name("arealoc")).sendKeys("banshankri");
        driver.findElement(By.name("nominee_name")).sendKeys("smruti");
        driver.findElement(By.name("nominee_ac_no")).sendKeys("2345678");
        WebElement act = driver.findElement(By.name("acctype"));
        Select s3= new Select(act);
        s3.selectByValue("Saving");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("cnfrm-submit")).click();
        Alert a3 = driver.switchTo().alert();
       String tx = a3.getText();
        String y = a3.getText();
        driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("210001");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.name(("staff_login-btn"))).click();
        driver.findElement(By.name("apprvac")).click();
        driver.findElement(By.name("application_no")).sendKeys("192189454 ");
   driver.findElement(By.name("search_application")).click();
   driver.findElement(By.name("approve_cust")).click();
   Alert a = driver.switchTo().alert();
        a.accept();
        driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
        driver.findElement(By.name("view_cust_by_ac")).click();
        driver.findElement(By.name("account_no")).sendKeys("1011481011967");
        driver.findElement(By.name("submit_view")).click();
	}

}
