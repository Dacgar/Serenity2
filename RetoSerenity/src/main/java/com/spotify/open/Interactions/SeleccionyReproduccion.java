package com.spotify.open.Interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.spotify.open.UI.BusquedayReproduccionUI.LBL_NOMBRE_CANCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionyReproduccion implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade>ListaCanciones = LBL_NOMBRE_CANCION.resolveAllFor(actor);
        Random random= new Random();
        int index = random.nextInt(ListaCanciones.size());

        WebElementFacade cancion = ListaCanciones.get(index);
        cancion.click();

    }

    public static Performable clic(){
        return instrumented(SeleccionyReproduccion.class);
    }
}
