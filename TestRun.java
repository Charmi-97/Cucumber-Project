 package TestRunner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(tags=" ", features= {"/CucumberProject/src/test/resources/Feature"},
glue= {"/CucumberProject/src/test/java/StepDef"},
plugin= {"pretty","html:target/htmlreport.html"})

public class TestRun  {

}
