/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldado;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author david
 */
public class Soldado {
    String estado = "vivo";
    double posicionX;
    double posicionY;
    //String ruta = "";
    //ImageView cuerpo = new ImageView(new Image(ruta, posicionX, posicionY, false, false));

    
    public Soldado(double posicionX, double posicionY, int tamanox, int tamanoy) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        //cuerpo.setFitHeight(tamanoy);
        //cuerpo.setFitWidth(tamanox);
    }

    
    public String getEstado() {
        return estado;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

   
    public void setEstado(String estado) {
        this.estado = estado;
        //Image nruta = new Image("imagenes/muerto.png");
        //cuerpo.setImage(nruta);
    }

  
}
