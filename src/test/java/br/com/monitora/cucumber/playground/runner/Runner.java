package br.com.monitora.cucumber.playground.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"br.com.monitora.cucumber.playground.steps"},
        features = {"src/test/resources/features"},
        plugin = {"pretty"},
        tags = {"~@ignore"},
        monochrome = false,
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE
)
public class Runner {}
