package com.randychurunel.controller;

import com.randychurunel.model.Usuario;
import com.randychurunel.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Login {

    private final LoginView LOGIN_VIEW;
    private double ejeX;
    private double ejeY;
    private final AuthSistema authSistema = new AuthSistema();

    public Login(LoginView loginView) {
        this.LOGIN_VIEW = loginView;

        construirAcciones();

    }

    private Stage escenarioPrincipal = SceneManager.getInstanciaSceneManager().getEscenarioPrincipal();

    public void iniciarSesion() {
        String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String clave = this.LOGIN_VIEW.getPwdClave().getText().trim();

        if (nombreUsuario.isEmpty()) {
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");

            JOptionPane.showMessageDialog(null, "Error el nombre usuario esta vacio");
        } else if (clave.isEmpty()) {
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("empty");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "Error la contraseña no se ingreso");

        } else {

            this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
            // metodo login 
            Usuario usuario = authSistema.login(nombreUsuario, clave);

            if (usuario == null) {

                JOptionPane.showMessageDialog(null, "tus datos no son corectos");

            } else {
                this.escenarioPrincipal.hide();
                SceneManager.getInstanciaSceneManager().ventanaBienvenida(usuario.getNombreCompleto());
                

            }

        }

    }

    public void construirAcciones() {

        this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
                (evento) -> {
                    iniciarSesion();

                }
        );

        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {

                    System.exit(0);
                }
        );

        this.LOGIN_VIEW.setOnMouseClicked(
                (evento) -> {
                    ejeX = evento.getSceneX();
                    ejeY = evento.getSceneY();

                }
        );

        this.LOGIN_VIEW.setOnMouseDragged(
                (evento) -> {

                    double ejeXDesplasamientoVentana = evento.getScreenX();
                    double ejeYDesplasamientoVentana = evento.getScreenY();

                    escenarioPrincipal.setX(ejeXDesplasamientoVentana - ejeX);
                    escenarioPrincipal.setY(ejeYDesplasamientoVentana - ejeY);
                }
        );
    }

}
