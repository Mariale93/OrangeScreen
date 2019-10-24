package co.com.choucair.certification.orange.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/orange.feature",
        glue = {"co.com.choucair.certification.orange.stepdefinitions","co.com.choucair.certification.orange.util"},
        snippets = SnippetType.CAMELCASE)
public class
RunnerTags {

}
