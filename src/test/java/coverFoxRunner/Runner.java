package coverFoxRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"D:\\chaitali project clone\\31May25EveningChaitali\\src\\test\\resources\\FeatureFile\\CoverFoxHealthInsurance.feature"
		}
			,glue= {"coverFoxStepDefinitions","hooks"},
					plugin={"pretty","html:target/cucumber-reports/reports.html"},
					publish= true,dryRun=false
					)
					
		
		
		


public class Runner extends AbstractTestNGCucumberTests {

	
}
