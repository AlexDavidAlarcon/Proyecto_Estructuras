/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import com.mycompany.proyecto_estructuras.Principal;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author david
 */
public class VistaPantalla {
    Sistema sis=new Sistema();
    private StackPane menu = new StackPane();
    private HBox base_inicio = new HBox(100);
    private ImageView fondo;
    private Button empezar = new Button("Empezar");

    
    public VistaPantalla() {
        this.fondo = new ImageView(new Image("Imagenes/fondo", 1000, 500, false, false));
        this.base_inicio.setAlignment(Pos.TOP_CENTER);
        this.menu.getChildren().addAll(fondo, base_inicio);
        
        empezar.setOnMouseClicked(e->Empezar());
    }

    /**
     * retorna el nodo principal que se presentara en la escena principal
     * @return 
     */
    public StackPane getMenu_inicio() {
        return menu;
    }

    
    public void Empezar(){
        Principal.stage.setScene(new Scene(sis.getContenido(),1000,500));
    }
}
