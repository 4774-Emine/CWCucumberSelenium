package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/report-parallel/report.html"
        },
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"}
)
//Bu paralel runnerları mvn ile çalıştırabilmek için pom a bazı pluginler ekledik
//mvn buttonuna tıklayınca mvn lifecylce komutları çıkıyor

public class ParallelRunner {


}
