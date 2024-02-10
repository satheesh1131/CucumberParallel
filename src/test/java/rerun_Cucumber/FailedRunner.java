package rerun_Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target\\FailedScenarios.txt",
				 glue="com\\stepDefinition",
				 dryRun = !true,
				 publish = true,
				 stepNotifications = true,
				 plugin = {"pretty"},
				 snippets = SnippetType.CAMELCASE)
public class FailedRunner {

}
