package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//her yerde sabit
@CucumberOptions(//içerik değişebilir.
        features = {"src/test/resources/features/firstFeature.feature"},//süslüler olmasa da kabul ediyor
        glue = "stepdefinitions"

)

public class FirstRunner {


}
