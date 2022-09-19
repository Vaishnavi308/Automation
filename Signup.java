package mobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup {
@Test
	public void test() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishnavi.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		driver.findElement(By.className("my-sm-0")).click();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys("vaishnavi");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("sara");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("vaishu308");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("5/10/2022");
		driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9999955555");
		driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("Nice");
		driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]")).click();

	}
}
