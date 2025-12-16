package com.orangehrm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/regression/ValidatePastDateIsNotWorking.feature",
		glue="com.orangehrm.steps",
		dryRun=false,
		tags="@TC-103")
public class RegRunner {

}
