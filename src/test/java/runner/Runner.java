package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/inserir_conta.feature",
        glue = "steps",
        tags = {"~@ignore"},
        plugin = {"pretty", "html:target.report-html", "json:target/report.json"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
        )

public class Runner {

}
