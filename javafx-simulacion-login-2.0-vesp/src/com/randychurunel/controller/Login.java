package com.randychurunel.controller;

import com.randychurunel.view.LoginView;

public class Login {
    private final LoginView LOGIN_VIEW;
    
    public Login(LoginView loginView){
        this.LOGIN_VIEW= loginView ;
        
        construirAcciones();
        
    
    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void construirAcciones (){
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
        (evento)->{
        
         System.exit(0);}
        
        
        
        
        ) ;
    
    
    }
    
}
