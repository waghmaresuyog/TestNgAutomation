package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageLayer.HomePage;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public HomePage homePage;
    //Parameters annotation use to take value from xml file and pass to method
    @Parameters("browser")
    @BeforeMethod       // this annotation is use for run  before any test and start method use to open Browser 
    public void start(String browser) {
        //String browser = "firefox";
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        homePage=new HomePage(driver);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5);
        driver.close();
    }

}
