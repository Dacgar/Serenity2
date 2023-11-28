package com.spotify.open.stepDefinitions;

import com.spotify.open.Questions.ValidacionReproduccion;
import com.spotify.open.Tasks.BusquedaCancion;
import com.spotify.open.Tasks.ReproduccionCancion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.*;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaCancionStepDefinitions {
    @Cuando("el usuario escriba el nombre de la cancion")
    public void elUsuarioEscribaElNombreDeLaCancion() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaCancion.on());
    }
    @Cuando("seleccione la cancion elegida")
    public void seleccioneLaCancionElegida() {
        OnStage.theActorInTheSpotlight().attemptsTo(ReproduccionCancion.on());
    }
    @Entonces("se reproducira la cancion seleccionada")
    public void seReproduciraLaCancionSeleccionada() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionReproduccion.from(), Matchers.equalTo(true)
                )
        );
    }



}
