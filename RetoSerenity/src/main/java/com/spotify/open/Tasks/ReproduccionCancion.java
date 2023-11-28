package com.spotify.open.Tasks;

import com.spotify.open.Interactions.SeleccionyReproduccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.spotify.open.UI.BusquedayReproduccionUI.BTN_REPRODUCIR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReproduccionCancion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionyReproduccion.clic(),
                Click.on(BTN_REPRODUCIR)
        );
    }
    public static ReproduccionCancion on(){
        return instrumented(ReproduccionCancion.class);
    }
}
