package mobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin {
@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishnavi.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("my-sm-0")).click();
		driver.findElement(By.id("username")).sendKeys("vaishnavi");
		driver.findElement(By.id("password")).sendKeys("vaishu308");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		
	}

}
