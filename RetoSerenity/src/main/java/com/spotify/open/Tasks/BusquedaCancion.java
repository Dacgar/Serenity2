package com.spotify.open.Tasks;

import com.spotify.open.Interactions.SeleccionyReproduccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.spotify.open.UI.BusquedayReproduccionUI.BTN_BUSCAR;
import static com.spotify.open.UI.BusquedayReproduccionUI.TXT_ESCRIBIR_NOMBRE_CANCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaCancion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BUSCAR),
                Enter.keyValues("Creep").into(TXT_ESCRIBIR_NOMBRE_CANCION)
        );
}

public static BusquedaCancion on(){
        return instrumented(BusquedaCancion.class);
    }
}
