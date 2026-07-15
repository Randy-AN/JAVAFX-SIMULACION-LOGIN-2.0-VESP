package com.randychurunel.controller;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import com.randychurunel.view.LoginView;
import javafx.scene.paint.Color;
public class SceneManager {

    private Stage escenarioPrincipal;
    private Stage escenarioSecundaria;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;

    private SceneManager() {
    }

    public void ventanaLogin() {
        try {
           
            LoginView login = LoginView.getInsatanciaLoginView();
            cambiarEscena(login, 477, 555);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new Login(login);
            
            
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "error objeto nulo: ventana login  ");
            objetoNulo.printStackTrace();

        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "error padre : ventana login  ");
            errorPadre.printStackTrace();
        }
         
    }

    public void cambiarEscena(Pane panel, int ancho, int alto) {
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "error objeto nulo: cambiar escena ");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "error padre : cambiar de escena  ");
            errorPadre.printStackTrace();
        }

    }

    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenariSecundaria() {
        return escenarioSecundaria;
    }

    public void setEscenariSecundaria(Stage escenariSecundaria) {
        this.escenarioSecundaria = escenariSecundaria;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }

}

