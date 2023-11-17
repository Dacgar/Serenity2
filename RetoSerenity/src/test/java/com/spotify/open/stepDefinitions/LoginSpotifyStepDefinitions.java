package com.spotify.open.stepDefinitions;

import com.spotify.open.Questions.Validaciones;
import com.spotify.open.Tasks.InicioSesion;
import com.spotify.open.Tasks.PaginaPrincipalSpotify;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginSpotifyStepDefinitions {
    @Before
    public void setStage(){

        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abra en el navegador la pagina de Spotify")
    public void queElUsuarioAbraEnElNavegadorLaPaginaDeSpotify() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://open.spotify.com/intl-es")
        );
    }
    @Cuando("el usuario ingresa el usuario y contraseña")
    public void elUsuarioIngresaElUsuarioYContraseña() {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaPrincipalSpotify.on());
    }
    @Cuando("presiona la tecla enter")
    public void presionaLaTeclaEnter() {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesion.on());
    }
    @Entonces("el usuario podra ver sus listas de reproducción.")
    public void elUsuarioPodraVerSusListasDeReproducción() {
        OnStage.theActorInTheSpotlight().should(seeThat(Validaciones.onTheSite(),equalTo("Buscar")));
    }

}
