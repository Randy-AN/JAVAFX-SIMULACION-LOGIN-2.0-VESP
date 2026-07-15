
package com.randychurunel.view;

import com.randychurunel.controller.Imagen;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;



public class LoginView extends BorderPane{
    
    private static LoginView insatanciaLoginView;
    private Button btnCerrarVentana; 
    private Label lblTituloVentana ;
    private HBox barraDeOpciones;
    private VBox cajaVertical;
    private Label lblNombreUsuario ;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;
    private GridPane formulario;
    private ImageView imageLogin;
    private Button btnIniciarSesion;
    
    private final String RUTA_ESTILOS =  "/com/randychurunel/styles/";
    
    
    
    private LoginView(){
        
        this.getStylesheets().add(RUTA_ESTILOS+"loginStyles.css");
        
        this.setPadding( new Insets(7)); 
        this.setBorder(new Border(new BorderStroke(Paint.valueOf("2094C9"),BorderStrokeStyle.SOLID,
                                               new CornerRadii(17),
                                               new BorderWidths(5))));
        
        this.setBackground(new Background(
                                     new BackgroundFill(Paint.valueOf("B8E0FF"),
                                     new CornerRadii(17),
                                     Insets.EMPTY)));
        
        barraDeOpciones = new HBox (24);
        
        btnCerrarVentana = new Button("X");
        lblTituloVentana = new Label ("JavaFX - simulacion login");
        
         barraDeOpciones.getChildren().addAll(btnCerrarVentana , lblTituloVentana );
         
         this.setTop(barraDeOpciones );
         
         // objetos del foermulario 
         cajaVertical = new VBox (); 
         
         formulario = new GridPane () ;
         
         lblNombreUsuario  = new Label("Ingrese Su Usuario Please");
         txtNombreUsuario  = new TextField();

         lblClave = new Label ("Ingrese Su Password ");
         pwdClave = new PasswordField();
         
         formulario.add(lblNombreUsuario, 0, 0);
         formulario.add(txtNombreUsuario, 2, 0);
         formulario.add(lblClave, 0, 2);
         formulario.add(pwdClave, 2, 2);
        
         btnIniciarSesion = new Button ("Iniciar sesion ");
         
          imageLogin = new ImageView (new Imagen().getImageLogin("logo"));
          imageLogin.setFitWidth(99);
          imageLogin.setFitHeight(99);
          imageLogin.setCache(true);
          
          cajaVertical.setAlignment(Pos.CENTER);
         
         cajaVertical.getChildren().addAll(imageLogin,formulario , btnIniciarSesion);
         
         this.setCenter(cajaVertical);
    }

    
    public static LoginView getInsatanciaLoginView() {
        if ( insatanciaLoginView == null)
             insatanciaLoginView = new LoginView ();
        return insatanciaLoginView;
    }

    public static void setInsatanciaLoginView(LoginView insatanciaLoginView) {
        LoginView.insatanciaLoginView = insatanciaLoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }

    public VBox getCajaVertical() {
        return cajaVertical;
    }

    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }

    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public ImageView getImageLogin() {
        return imageLogin;
    }

    public void setImageLogin(ImageView imageLogin) {
        this.imageLogin = imageLogin;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(Button btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }
     
    
    
    
    
}

