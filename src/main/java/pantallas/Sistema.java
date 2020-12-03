/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import tdas_linkedlist.CircularLinkedList;

/**
 *
 * @author david, Gabriel
 */
public class Sistema {
    
    Pane contenido;
    Label titulo;
    CircularLinkedList soldados;
    Label cantidadSelec;
    Slider posicionInicio;
    Pane imagenesSoldado;
    HBox opciones;
    VBox direccion;
    Label direccionSelec;
    Button izquierda;
    Button derecha;
    ImageView fondo;
    Button simular;
    
    public Sistema() {
    }
    
    public Pane getContenido() {
        return this.contenido;
    }
    
    public void agregarContenido() {
        
    }
    
    public void iniciarContenido() {
        
    }
    
}
