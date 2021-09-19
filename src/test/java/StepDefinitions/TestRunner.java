package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
glue= {"StepDefinitions"},
monochrome=true,
plugin=  {"pretty","json:target/JSONReports/report.json","pretty","html:target/HTMLReports/report.html",
"junit:target/XMLReports/report.xml"},
tags= "@googlesearch or @~smoketest or @~@prodnew or @~@prodnew"
)
public class TestRunner {

}
