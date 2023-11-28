package com.spotify.open.Questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.spotify.open.UI.BusquedayReproduccionUI.VAL_PLAY;

public class ValidacionReproduccion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade cancion = VAL_PLAY.resolveFor(actor);
        return cancion.isDisplayed();
    }
    public static Question<Boolean>from(){
        return new ValidacionReproduccion();
    }
}
