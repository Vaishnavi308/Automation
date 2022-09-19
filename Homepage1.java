package mobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage1 {
	@Test
	public void Hm() throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishnavi.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

     driver.get("https://mobileworld.banyanpro.com/");
      driver.manage().window().maximize();
      LandingPage landingpage = new LandingPage(driver);
      Thread.sleep(1000);
    //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
    //  WebDriverWait wait = new WebDriverWait(driver,30);
      landingpage.Homepage1();
	}

}
