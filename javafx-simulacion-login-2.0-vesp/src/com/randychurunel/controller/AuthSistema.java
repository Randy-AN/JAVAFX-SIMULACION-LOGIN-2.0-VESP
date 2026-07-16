
package com.randychurunel.controller;

import com.randychurunel.model.Rol;
import com.randychurunel.model.Usuario;
import java.util.ArrayList;


public class AuthSistema {
  private static ArrayList <Usuario> ListaUsuarios = new ArrayList<>();
  public AuthSistema(){
      Usuario usuarioAdmin = new Usuario ("admin", "admin","admin", Rol.ADMIN);
      
      Usuario usuarioUser = new Usuario ("user", "user","user", Rol.USER);
              
     Usuario usuarioYO = new Usuario ("randy ", "uno","Randy Churunel", Rol.ADMIN);
  
     ListaUsuarios.add(usuarioAdmin);
     ListaUsuarios.add(usuarioUser );
     ListaUsuarios.add(usuarioYO );
     
  }

  public Usuario login (String nombreUsuario , String calve ){
      for (Usuario usuarioBuscado : ListaUsuarios){
          if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                  && usuarioBuscado.getPassword().equals(calve))
         
              return usuarioBuscado;
      
      }
  
      return null;

      
  }
  
    public static ArrayList<Usuario> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> ListaUsuarios) {
        AuthSistema.ListaUsuarios = ListaUsuarios;
    }

    
    
    
    
}

