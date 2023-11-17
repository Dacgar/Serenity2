package com.spotify.open.Questions;

import com.spotify.open.Tasks.InicioSesion;
import com.spotify.open.UI.InicioSesionUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validaciones implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return InicioSesionUI.VAL_TEXTO_INGRESO.resolveFor(actor).getText();
    }

    public static Question<String> onTheSite(){
        return new Validaciones();
    }

}
