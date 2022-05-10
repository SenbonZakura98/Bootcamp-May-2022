package com.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        //Feature File Path
        (features ="classpath:Features/login.feature",
                glue = {"StepDefs"},//--StepDefinition File Path
                dryRun = false, //-- True will define undefined steps and false will assume there aren't any undefined steps
                monochrome = true,// console output test case design
                plugin = {"pretty","html:TestOutput_HTML/report.html"}//--Generating an html type report

        )

public class Running {

    @org.junit.AfterClass
   public static void writeExtentReport() {
      // Reporter.loadXMLConfig("Config/report.xml");
    }
}