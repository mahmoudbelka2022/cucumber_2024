package com.cydeo.runner;


import io.cucumber.junit.*;
import io.cucumber.plugin.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",
                "json:target/cucumber-reports/CucumberTestReport.json"

        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = true,
        tags = "@smoke",
        publish = true
)
public class CukesRunner {
}
