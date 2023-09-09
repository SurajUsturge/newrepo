package runnerClass_Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Parameterised_login.feature", glue="stepdefination")

public class Runner_class_CucumberTest 
{

}
