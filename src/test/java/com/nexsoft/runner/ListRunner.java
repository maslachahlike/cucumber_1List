package com.nexsoft.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				 features = {"src/test/resources/List.feature"},
				 glue = "com.nexsoft.definitions")
public class ListRunner extends AbstractTestNGCucumberTests {

}
