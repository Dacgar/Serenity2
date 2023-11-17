package com.spotify.open.Tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.spotify.open.UI.PaginaPrincipalSpotifyUI.BTN_INICIAR_SESION;

public class PaginaPrincipalSpotify implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_INICIAR_SESION));
    }

    public static Performable on(){
        return Instrumented.instanceOf(PaginaPrincipalSpotify.class).withProperties();
    }

}
