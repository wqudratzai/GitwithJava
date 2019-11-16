package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

@org.testng.annotations.Test
public static void Testing () throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	
Actions action = new Actions(driver);

action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click().build().perform();

WebElement emailid = driver.findElement(By.id("ap_email"));
emailid.sendKeys("wqudratzai@outlook.com");



	

	

	
	
}


}
