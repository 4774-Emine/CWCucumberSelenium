package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Task01Page;
import utilities.Driver;

public class Task01StepDefinition {

    //Feature: Google da cucmber aramasi
// Scenario: Google da kelime arandiginda ilgili kelime title da görüntülenmelidir.// Given Kullanici google sayfasindadir.
//  When Kullanici Cucumber kelimesini aradiginda
//  Then Kullanici sayfada cucumber kelimesini dogrular.

    @Given("Kullanici google sayfasindadir.")
    public void kullaniciGoogleSayfasindadir() {

        Driver.getDriver().get("https:www.google.com");
    }

    @When("Kullanici Cucumber kelimesini aradiginda")
    public void kullaniciCucumberKelimesiniAradiginda() {
        Task01Page tp=new Task01Page();
        tp.arama("cucumber");
    }

    @Then("Kullanici sayfada cucumber kelimesini dogrular.")
    public void kullaniciSayfadaCucumberKelimesiniDogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
        Driver.closeDriver();
    }
}
