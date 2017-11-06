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

    String color, posicion, figura;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Ficha() {
    }

    public Ficha(String color, String posicion, String figura) {
        this.color = color;
        this.posicion = posicion;
        this.figura = figura;
    }

    public void seleccionarColor() throws IOException {
        System.out.println("Seleccione el color de sus fichas\n 1. Verde\n 2. Azul\n 3. Amarillo\n 4. Rojo");
        int respuestaColor = reader.read();
        switch (respuestaColor) {
            case 1:
                color = "verde";
                break;
            case 2:
                color = "azul";
                break;
            case 3:
                color = "amarillo";
                break;
            case 4:
                color = "rojo";
                break;
        }
    }

    public void figuraPosicion() {
        switch (color) {
            case "verde":
                figura = "&#x222e";
                posicion = "";
                break;
            case "rojo":
                figura = "";
                posicion = "";
                break;
            case "azul":
                figura = "";
                posicion = "";
                break;
            case "amarillo":
                figura = "";
                posicion = "";
                break;
        }
    }

}
