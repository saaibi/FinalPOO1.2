/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

/**
 *
 * @author DAVID
 */
public class Jugador {

    String nombre;
    String color;
    Ficha[] fichas = new Ficha[4];

    public Jugador() {
    }

    public Jugador(String nombre, String color, Ficha[] fichas) {
        this.nombre = nombre;
        this.color = color;
        this.fichas = fichas;
    }

}
