
package com.randychurunel.view;

import javafx.scene.layout.VBox;


public class BienvenidaView extends VBox  {
    private static BienvenidaView instanciaBienvenidaView ;
    
    public BienvenidaView (){
    
    
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
    
    
    
}
