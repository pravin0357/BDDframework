package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@cucumber.api.CucumberOptions(features = "src/test/resources/features", glue = { "com.qa.stepdefinations" }, tags= {"@DryRun1"},plugin = { "pretty", "html:target/cucumber-reports" })

public class Runner {

}
 