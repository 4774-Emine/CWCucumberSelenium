package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Task01Page {


   public  Task01Page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath="//div/input")
private WebElement aramaKutusu;

public void arama(String value){
    aramaKutusu.sendKeys(value+ Keys.ENTER);

}









}



