
package com.randychurunel.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BienvenidaView extends VBox  {
    private static BienvenidaView instanciaBienvenidaView ;
    public BienvenidaView(String nombre) {
       this.setStyle("-fx-background-color: #2c3e50; -fx-background-radius:20;");
       this.setAlignment(Pos.CENTER);
       this.setPrefSize(400, 200);
       
       Label lbl = new Label("bienvenido"+nombre);
       lbl.setStyle("-fx-text-fill: white; -fx-font-size: 20px; -fx-font-weight: bold;");
       this.getChildren().add(lbl);
       
       
       Label btnCerrar = new Label ("X");
       btnCerrar.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-cursor: hand; -fx-padding: 10px;");
       btnCerrar.setOnMouseClicked(e -> {
           ((Stage) this.getScene().getWindow()).close();
       });
       
       this.getChildren().add(0,btnCerrar);
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }

   

    
    
}
