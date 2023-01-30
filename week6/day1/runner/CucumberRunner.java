package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features="src/test/java/features",
                 glue = "steps",
                 monochrome=true,
                 publish=true,
                 //tags="@Smoke"  //run only smoke testcases
                 //tags="@Smoke or @Regression"  //run either any one testcase
                 //tags="@Smoke and @Regression"// run the scenarios having both tags
                 tags="not @Smoke" //to execute all the scenarios except smoke
                 
                 )
public class CucumberRunner extends BaseClass{

}
