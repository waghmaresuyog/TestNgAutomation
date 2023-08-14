package utilites;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.text.SimpleDateFormat;
import java.util.Date;


import static java.util.logging.FileHandler.*;

public class UtilClass extends TestBase {
    public UtilClass(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElement addToCart;
    public void clickAddToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addToCart.click();
        System.out.println("successful added to Cart ");
    }

    public void acceptPopup(){
        driver.switchTo().alert().accept();
    }

    public void takeScreenshotMethod(String name){

        try {
            TakesScreenshot screenshot = (TakesScreenshot)driver;
            File src =    screenshot.getScreenshotAs(OutputType.FILE);
            File des = new File("src/test/ScreenShot"+name+".png");
            FileHandler.copy(src,des);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void takeScreenshot(String name) {
        try {
            // Get current date and time
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String dateTime = dateFormat.format(new Date());
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            File des = new File("src/test/ScreenShot/" + name +dateTime+ ".png");
            FileHandler.copy(src, des);
        } catch (IOException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }


}
