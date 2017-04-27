package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome=true,
features="src/test/resources/features",
glue="stepdefinitions",
strict=true,
tags="@Login",
dryRun=false,
plugin={"pretty","html:cucumber-report/cucumber-html-report","json:cucumber-report/cucumber-report.json"})
public class EMSUIRunner {

}
