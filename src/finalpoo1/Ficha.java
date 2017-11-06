/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DAVID
 */
public class Ficha {

    String posicion, figura;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Ficha() {
    }

    public Ficha(String posicion, String figura) {
        this.posicion = posicion;
        this.figura = figura;
    }

    public void figuraPosicion(Jugador p1) {
        switch (p1.color) {
            case "Verde":
                figura = "♙";
                posicion = "12,2";
                break;
            case "Azul":
                figura = "♘";
                posicion = "12,2";
                break;
            case "Rojo":
                figura = "♔";
                posicion = "12,1";
                break;
            case "Amarillo":
                figura = "♗";
                posicion = "12,0";
                break;
        }
    }

}
