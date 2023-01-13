package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Task02Page {

    private WebDriver driver;

    public Task02Page() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(name="q")
    private WebElement aramaKutusu;

    public void arama(String value) {
        aramaKutusu.sendKeys("selenium"+ Keys.ENTER);
    }


}
