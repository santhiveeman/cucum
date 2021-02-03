package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class	)

@CucumberOptions(
		
		features="feature",
		glue= {"stepdefenition"	}
			//format= {"pretty"},
		    //monochrome=true
				
		
		)
public class testRunner {

	

}
