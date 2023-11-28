package com.spotify.open.UI;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedayReproduccionUI {

    public static Target BTN_BUSCAR = Target.the("Boton buscar")
            .locatedBy("//span[contains(text(),'Buscar')]");
    public static Target TXT_ESCRIBIR_NOMBRE_CANCION = Target.the("Escribir el nombre de cancion")
            .locatedBy("//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf']");
    public static Target LBL_NOMBRE_CANCION = Target.the("titulos de las canciones que retorna en lista")
            .locatedBy("//div[@role='presentation']//div[contains(text(),'Creep')]");

    public static Target BTN_REPRODUCIR =Target.the("boton de play")
            .locatedBy("//span[@class='ButtonInner-sc-14ud5tc-0 fGgTkO encore-bright-accent-set']");

    public static Target VAL_PLAY =Target.the("validacion elemento pagina")
            .locatedBy("(//a[contains(text(),'Radiohead')])[2]");
}
