package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\FbLogin.feature",
				 glue="com\\stepDefinition",
				 dryRun = !true,
				 publish = true,
				 snippets =SnippetType.CAMELCASE,
				 plugin = {"pretty","rerun:target/FailedScenarios.txt"}
				 )
public class Runner {

}
