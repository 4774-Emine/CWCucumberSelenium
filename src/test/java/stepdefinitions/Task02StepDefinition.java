package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Task01Page;
import pages.Task02Page;
import utilities.Driver;


/*
Feature: Google arama
        Scenario: Kullanıcı Google a gider ilgili kelimeyi arar ve kelimenin arandigini dogrular
        Given Kullanici google sayfasina gider
        When Kullaini selenium u aratir
        Then Kullanici selenium kelimesini aradigini dogrular*/


public class Task02StepDefinition {
    @Given("Kullanici google sayfasina gider")
    public void kullaniciGoogleSayfasinaGider() {
        Driver.getDriver().get("https:www.google.com");
    }

    @When("Kullaini selenium u aratir")
    public void kullainiSeleniumUAratir() {
        Task02Page tp=new Task02Page();
        tp.arama("selenium");
    }

    @Then("Kullanici selenium kelimesini aradigini dogrular")
    public void kullaniciSeleniumKelimesiniAradiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium") );
    }
}
