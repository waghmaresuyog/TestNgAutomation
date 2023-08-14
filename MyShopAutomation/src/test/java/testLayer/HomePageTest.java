package testLayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageLayer.HomePage;
import testBase.TestBase;
import utilites.UtilClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePageTest extends TestBase {
    //  HomePage homePage;
    UtilClass utilClass;

    @Test
    public void verifyByProcessSamsungS6() throws InterruptedException {
        // homePage = new HomePage(driver);
        homePage.clickPhone();
        homePage.clickOnSamsungGalaxyS6();
        utilClass = new UtilClass();
        utilClass.clickAddToCart();
        Thread.sleep(3000);
        utilClass.acceptPopup();

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @Test
    public void verifyNokiaLumia() throws InterruptedException {
        homePage.clickPhone();
        homePage.clickNokiaLumia();
        utilClass = new UtilClass();
        utilClass.clickAddToCart();
        Thread.sleep(3000);
        utilClass.acceptPopup();

    }

    @Test
    public void verifyNexus6() {
        homePage.clickPhone();
        homePage.clickOnNexus6();
        utilClass = new UtilClass();
        utilClass.clickAddToCart();
        utilClass.acceptPopup();
    }
}
