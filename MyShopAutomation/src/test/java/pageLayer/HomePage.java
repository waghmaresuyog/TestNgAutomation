package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class HomePage extends TestBase {
   // WebDriver driver;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Phones')]")
    private WebElement phone;
    public void clickPhone(){
        phone.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
    private WebElement samsungGalaxyS6;

    public void clickOnSamsungGalaxyS6(){
        samsungGalaxyS6.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Nokia lumia 1520')]")
    WebElement nokiaLumia;

    public void clickNokiaLumia(){
        nokiaLumia.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Nexus 6')]")
    private WebElement nexus6;

    public void clickOnNexus6(){
        nexus6.click();
    }

}
