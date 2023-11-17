package com.spotify.open.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.spotify.open.UI.InicioSesionUI.*;

public class InicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("diecadman@gmail.com").into(TXT_USUARIO),
                Enter.keyValues("Cadena121").into(TXT_CLAVE),
                Click.on((BTN_INICIAR_SESION)));
    }

    public static Performable on(){
        return Instrumented.instanceOf(InicioSesion.class).withProperties();
    }
}
