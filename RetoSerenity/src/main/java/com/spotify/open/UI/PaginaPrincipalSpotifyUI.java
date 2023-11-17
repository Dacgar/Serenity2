package com.spotify.open.UI;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalSpotifyUI {

    public static Target BTN_INICIAR_SESION =Target.the("boton de inicio de sesion en spotify")
            .locatedBy("//span[contains(text(),'Iniciar sesión')]");
}
