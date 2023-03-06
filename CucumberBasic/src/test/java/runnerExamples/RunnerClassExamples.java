package runnerExamples;

import java.security.KeyStore.TrustedCertificateEntry;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

/*
 * cucumber option:
 * feature - where customer can read easily
 * glue - it will relate feature file and step defin in runner class
 * dry run - true - which wont run the code and in console it will show whther all the step definition have imp
 * before executing we can use dry run to chk whether all steps are imp
 * map between feature and step definition
 * 
 * not avalable currently - strict
 * strict - true - it will run all the steps and finally it will show whether all the steps are imp 
 * like maping feature file and step definition and will show as failed in console of Junit
 * strict - false - it will run and shows unimplemented steps but testcase will be passed in Junit console.
 * 
 * monochrome -true -  to print human readable in console
 * format-not currently used as it is deprecated - use plugin instead
 * 
 * Stepnotification - then only test steps will be display in Junit console section
 * 
 * tags - starts with '@' - we can annotate feature file whichever to run 
 * if we use 'not @' it will run all cases other than @ annotated case
 * we can add multiple tags to run multiple feature files at a time using "or"
 * "and" is used to chk both conditions are true like @SimpleLogin and @Positive 9both are in same feature file)
 * 
 * */


//@CucumberOptions(features = "FeaturesFiles/OpenGoogle.feature", glue = "stepDefinitionsEx")
//@CucumberOptions(features = "FeaturesFiles/OpenOrangeHRM.feature", glue = "stepDefinitionsEx")

@CucumberOptions(features = "FeaturesFiles", 
				glue =  { "stepDefinitionsEx","hooks"}, // hooks are not needed for background concepts
				plugin = { "pretty", "html:target/cucumber-reports.html" }, 
				monochrome = true,dryRun = false, stepNotifications = true ,
				tags="@Background"
				//tags= "@SimpleLogin or @Orange"
				// above tags will run both feature file 
				// tags= "@SimpleLogin and not @Positive or @Orange" - it will run negative sc and orange feature file
				// tags ="(@SimpleLogin and not @Positive) or (@Orange and @Valid1)" - it will run after checking the feature file 
				)

//DataTableWithExamples.feature
public class RunnerClassExamples {

	// it should combine feature file and step definition
	// Runner define( by default cucumber support Junit to run the main class)

}
