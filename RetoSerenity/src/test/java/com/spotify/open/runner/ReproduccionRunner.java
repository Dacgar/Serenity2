package com.spotify.open.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BusquedaCancion.feature",
        glue = "com.spotify.open.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ReproduccionRunner {


}
