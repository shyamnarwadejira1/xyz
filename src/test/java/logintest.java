import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class logintest {

    public static void main(String[] args) {
         //trial comment for github
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Shyam\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        loginpage Logpage = new loginpage(driver);
        Logpage.emailId().sendKeys("shyamnarwade9@gmail.com");
        Logpage.pass().sendKeys("Shyam@123");
        Logpage.login().click();

        Accountpage myAccountpage = new Accountpage(driver);
        Assert.assertTrue(myAccountpage.Account().isDisplayed());
        driver.close();
    }
}

