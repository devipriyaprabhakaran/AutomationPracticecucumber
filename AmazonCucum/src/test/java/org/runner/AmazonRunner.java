package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src\\test\\java\\org\\feature",glue="org.stepdefinition")
public class AmazonRunner {

}
