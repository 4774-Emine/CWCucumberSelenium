package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {

    @Given("Ilk feature icin cucumber indirdim")
    public void ılk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step i çalıştı");

    }

    @When("Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {
        System.out.println("When step i oluştu");
    }

    @Then("Senaryomun calistigini konsolda görmeliyim")
    public void senaryomun_calistigini_konsolda_görmeliyim() {
        System.out.println("Then step i oluştu");
    }

}
