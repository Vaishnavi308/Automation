package mobile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
WebDriver driver;

public LandingPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

//signup

@FindBy(xpath= "//button[@type='submit']")
WebElement Signin1;
//
@FindBy(css= "a[href='signup.html']")
WebElement Signup1;

@FindBy(id =  "myName")
WebElement firstname;

@FindBy(xpath = "//input[@placeholder='Last Name']")
WebElement lastname;

@FindBy(xpath ="//input[@placeholder='Enter Email']")
WebElement email;

@FindBy(xpath ="//input[@placeholder='Password']")
WebElement signuppassword;

@FindBy(xpath ="//input[@type='date']")
WebElement date;

@FindBy(xpath ="//div[@class='col-md-3']//input[@name='gender']")
WebElement gender;

@FindBy(xpath ="//input[@placeholder='91XXXXXXXXXX']")
WebElement mobile;

@FindBy(css= " textarea[placeholder='Short Bio'] ")
WebElement shortbio;

@FindBy(xpath= "//button[@type='submit']")
WebElement register;


//Sign In

@FindBy(id="username")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement signinpassword;

@FindBy(xpath="//a[@type='submit']")
WebElement submit;

//Home page

@FindBy(id="home")
WebElement home1;

@FindBy(id="navbarDropdown")
WebElement latest;//before lenovo and before apple repeated

@FindBy(partialLinkText="Samsung")
WebElement samsung;

@FindBy(partialLinkText="More Details")
WebElement MoreDetails;

@FindBy(className="nav-link")
WebElement buy;//for apple also

@FindBy(partialLinkText="Lenovo")
WebElement lenovo;

@FindBy(partialLinkText="Apple")
WebElement apple;

@FindBy(xpath="//a[@id='navbarDropdown'][contains(.,'Support')]")
WebElement support;

@FindBy(partialLinkText="Order")
WebElement order;

@FindBy(partialLinkText="Contact Us")
WebElement contactus;

@FindBy(className="footeer")
WebElement footer;

@FindBy(xpath="//footer//a[@href=\"index.html\"]")
WebElement footerhome;

@FindBy(xpath="//footer//a[@href=\"mobile.html\"]")
WebElement footermobile;


@FindBy(xpath="//footer//a[@href=\"order.html\"]")
WebElement footerorder;

@FindBy(partialLinkText="Terms & Conditions")
WebElement Footerterms;

@FindBy(partialLinkText="Privacy Policy")
WebElement Privacy;

@FindBy(partialLinkText="Contact Us")
WebElement FooterContact;

@FindBy(xpath="//footer//a[@href=\"sign.html\"]")
WebElement footersignin;

//action
public void goTo()
{
    driver.get("https://mobileworld.banyanpro.com/");
}


public void Signup1application(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio) throws InterruptedException
{
   Signin1.click();
   Thread.sleep(1000);
    Signup1.click();
    Thread.sleep(1000);
    firstname.sendKeys(fname);
    Thread.sleep(1000);
    lastname.sendKeys(lname);
    Thread.sleep(1000);
    email.sendKeys(mail);
    Thread.sleep(1000);
    signuppassword.sendKeys(uppwd);
    Thread.sleep(1000);
    date.sendKeys(dob);
    Thread.sleep(1000);
    gender.click();
    Thread.sleep(1000);
    mobile.sendKeys(phone);
    Thread.sleep(1000);
    shortbio.sendKeys(bio);
    Thread.sleep(1000);
    register.click();
}


public void Signin1application(String name, String pwd) throws InterruptedException 
{
    Signin1.click();
    username.sendKeys(name);
    Thread.sleep(1000);
    signinpassword.sendKeys(pwd);
    Thread.sleep(1000);
    submit.click();
}
public void Homepage1() throws InterruptedException {
	 System.out.println(home1.getText());
     latest.click();
     Thread.sleep(1000);
     samsung.click();
     MoreDetails.click();
     Thread.sleep(1000);
     buy.click();
     latest.click();
     lenovo.click();
     Thread.sleep(1000);
     latest.click();
     apple.click();
     Thread.sleep(1000);
     buy.click();
     support.click();
     Thread.sleep(1000);
     Set<String> windowHandles = driver.getWindowHandles();//parentid.child
     List<String> windowHandlesList = new ArrayList<>(windowHandles);
     System.out.println(driver.getWindowHandle());
     order.click();
     System.out.println(driver.getWindowHandle());
     System.out.println("Total window number: " + windowHandlesList.size() + "\n");
     //driver.switchTo().window(windowHandlesList.get(1));
     home1.click();
     support.click();
     Thread.sleep(1000);
     contactus.click();
     footerhome.click();
     footermobile.click();
     Thread.sleep(1000);
     footerorder.click();
     System.out.println(driver.getWindowHandle());
     Footerterms.click();
     Privacy.click();
     Thread.sleep(1000);
     FooterContact.click();
     footersignin.click();
     Thread.sleep(1000);
     driver.quit();
}
	
}
	    