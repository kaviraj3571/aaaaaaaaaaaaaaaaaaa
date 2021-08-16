package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\adactinnormalbooking\\AdactinNormalBooking.feature",glue = "org.testclass",monochrome = true)
public class TestRunner {
	
	
	
	
	

}
