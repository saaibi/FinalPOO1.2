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
public class Jugador {

    String nombre;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String color;
    Ficha[] fichas = new Ficha[4];

    public Jugador() {
    }

    public Jugador(String nombre, String color, Ficha[] fichas) {
        this.nombre = nombre;
        this.color = color;
        this.fichas = fichas;
    }

    public void namePlayer() throws IOException {
        System.out.println("Por favor ingrese su nombre:");
        nombre = reader.readLine();
    }

    public void seleccionarColor() throws IOException {
        System.out.println(nombre + " selecionnee el número de color:\n 1. Amarillo\n 2. Rojo\n 3. Verde\n 4. Azul");
        int colorSelecionado = reader.read();
        switch (colorSelecionado) {
            case 1:
                color = "Amarillo";
                getFichas();
                System.out.println(nombre + ", su color es " + color);
                break;
            case 2:
                color = "Rojo";
                getFichas();
                System.out.println("Su color es " + color);
                break;
            case 3:
                color = "Verde";
                getFichas();
                System.out.println("Su color es " + color);
                break;
            case 4:
                color = "Azul";
                getFichas();
                System.out.println(nombre + ", su color es " + color);
                break;
        }
    }

    public void getFichas() {
        for (Ficha ficha : fichas) {
            ficha.figuraPosicion(this);
            System.out.println(ficha.posicion);
        }
    }
}
