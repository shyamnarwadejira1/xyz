package Apack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testpage {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Shyam\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        loginpage Loginpage = new loginpage(driver);  //test page driver passing to loginpage
        Loginpage.email().sendKeys("shyamnarwade9@gmail.com");
        Loginpage.Pass().sendKeys("Shyam@123");
        Loginpage.login().click();

        page2 Page2 = new page2(driver);  // test page driver passing to page2
        Page2.login2().click();
    }
}
