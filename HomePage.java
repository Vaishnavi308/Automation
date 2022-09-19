package mobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	@Test

	public void test() throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishnavi.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Samsung']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Lenovo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='btn btn-primary '][normalize-space()='More Details'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("my-sm-0")).click();
		driver.findElement(By.id("username")).sendKeys("vaishnavi");
		driver.findElement(By.id("password")).sendKeys("vaishu308");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Terms & Conditions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Support'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Order']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Support'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Contact Us']")).click();
		Thread.sleep(1000);
		
	}
}





