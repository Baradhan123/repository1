package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\fb\\com\\features",glue={"fb.com.stepdefination2","Hooks",}
,stepNotifications = false,tags="@AdactinTC-002",plugin = {"html:target\\Adactinreport\\adactin1.html","json:target\\json_Report\\adactin.json"},publish=true)
public class Runner {

}
