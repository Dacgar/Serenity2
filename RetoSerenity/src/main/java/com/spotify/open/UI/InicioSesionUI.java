package com.spotify.open.UI;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionUI {

    public static Target TXT_USUARIO =Target.the("Campo de texto para ingresar usuario")
            .locatedBy("//input[@id='login-username']");
    public static Target TXT_CLAVE = Target.the("Campo de texto de ingresar Contraseña")
            .locatedBy("//input[@id='login-password']");
    public static Target BTN_INICIAR_SESION = Target.the("boton de iniciar sesion")
            .locatedBy("//button[@id='login-button']");
    public static Target VAL_TEXTO_INGRESO = Target.the("Campo validacion de ingreso").
            locatedBy("//span[contains(text(),'Buscar')]");
}
