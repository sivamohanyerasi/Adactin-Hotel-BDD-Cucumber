package com.orangehrm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/regression",
		glue="com.orangehrm.steps",
		dryRun=true,
		tags="@TC-104")
public class RegRunner {

}
