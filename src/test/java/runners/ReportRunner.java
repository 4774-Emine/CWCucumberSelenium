package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

// raporlari olustururken format:path seklinde raporun nerede ve hangi formatta olusturacagimizi belirtiriz
@CucumberOptions(
        features = {"src/test/resources/features/07_Hooks.feature"},//hazır bir feature sayfası kullandık
        glue = {"stepdefinitions", "hooks"},
        plugin = {"html:target/cucumber-reports.html",//target kullandık çünkü mvn clean komutu ile silinebiliyor
                "json:target/json-reports/cucumber-json.json",
                "junit:target/cucumber-xml.xml",
                "pretty"//çıktının consolda daha güzel görünmesini sağlıyor
        },
        monochrome=false//tek renkli bir çıktı veriyor kullanılmasa da bir şey fark etmiyor


)
public class ReportRunner {

}

