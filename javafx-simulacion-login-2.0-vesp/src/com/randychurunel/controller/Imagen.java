package com.randychurunel.controller;

import javafx.scene.image.Image;

public class Imagen {

    private final String RUTA_IMAGENES = "/com/randychurunel/resources/";

    public Image getImageLogin(String nombreImagen) {

        Image crearImagen;

        switch (nombreImagen) {
            case "logo": // <-- Solo le quité el espacio que tenía "logo "
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.png");
                break;

            default:
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.png");
                break;
        }

        return crearImagen;
    }
}
