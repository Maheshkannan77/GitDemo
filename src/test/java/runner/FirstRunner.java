package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
    @CucumberOptions(features = {"src\\test\\java\\feature\\First.feature"}
    ,glue={"stepDefinitions"}, tags = {"@Smoke"})
    public class FirstRunner {
}