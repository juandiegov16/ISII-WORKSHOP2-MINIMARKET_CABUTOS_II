package ec.edu.espol.workshops;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html: build/reports/cucumber-report.html"},
		monochrome = true,
		features = "src/test/resources",
		glue = "ec.edu.espol.workshops")
public class Runner {
}