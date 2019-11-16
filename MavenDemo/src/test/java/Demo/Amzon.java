package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amzon {
	
	public static void Login () {
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https:\\www.amzon.com");
		
WebDriverWait wait = new WebDriverWait(driver, 20);

WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locator")));


driver.findElement(By.id("dddddd"));

driver.findElement(By.class("aaaaa"));
		
		
		
	}

}
