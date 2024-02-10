package testNG_Parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\testNG_Parallel\\FbLogin.feature",
				 glue="testNG_Parallel",
				 publish = true,
				 plugin = "pretty",
				 snippets = SnippetType.CAMELCASE,
				 dryRun = !true )

public class ParallelRunner extends AbstractTestNGCucumberTests {


	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	
	

}
