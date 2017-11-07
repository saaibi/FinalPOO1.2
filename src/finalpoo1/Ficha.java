/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author DAVID
 */
public class Ficha {

    String figura;
    int columnaIni, posicionInicialCol, posicionInicialFila = 12, posicionColNueva, posicionFilaNueva;
    boolean enJuego = false, corona = false;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Ficha() {
    }

    public Ficha(String figura, int columnaIni, int posicionCol, int posicionFila) {
        this.figura = figura;
        this.columnaIni = columnaIni;
        this.posicionInicialCol = posicionCol;
        this.posicionInicialFila = posicionFila;
    }

    public void figuraPosicion(String color) {
        switch (color) {
            case "Verde":
                figura = "♙";
                columnaIni = 2;
                posicionInicialCol = columnaIni;
                break;
            case "Azul":
                figura = "♘";
                columnaIni = 3;
                posicionInicialCol = columnaIni;
                break;
            case "Rojo":
                figura = "♔";
                columnaIni = 1;
                posicionInicialCol = columnaIni;
                break;
            case "Amarillo":
                figura = "♗";
                columnaIni = 0;
                posicionInicialCol = columnaIni;
                break;
        }
    }

}
