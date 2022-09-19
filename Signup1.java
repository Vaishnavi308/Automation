package mobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup1	 {
	@Test
    public void main() throws InterruptedException {
            // TODO Auto-generated method stub
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishnavi.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();

             driver.get("https://mobileworld.banyanpro.com/");
             LandingPage landingpage2 = new LandingPage(driver);
             landingpage2.goTo();
             Thread.sleep(1000);
             landingpage2.Signup1application("vaishnavi","sara","abc@gmail.com","vaishu308","5/10/2022","9876543211","Hi,How are you");
             

     }
}