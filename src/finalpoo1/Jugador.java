/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Jugador {

    String nombre, color;
    Scanner reader = new Scanner(System.in);
    Ficha ficha1 = new Ficha();
    Ficha ficha2 = new Ficha();
    Ficha ficha3 = new Ficha();
    Ficha ficha4 = new Ficha();

    public Jugador() {
    }

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void namePlayer() {
        System.out.println("Por favor ingrese su nombre:");
        nombre = reader.next();
    }

    public void seleccionarColor() {
        System.out.println(nombre + " selecionnee el número de color:\n 1. Amarillo\n 2. Rojo\n 3. Verde\n 4. Azul");
        int colorSelecionado = reader.nextInt();
        switch (colorSelecionado) {
            case 1:
                color = "Amarillo";
                System.out.println(nombre + ", su color es " + color);
                inicializarFichas();
                break;
            case 2:
                color = "Rojo";
                System.out.println(nombre + ", su color es " + color);
                inicializarFichas();
                break;
            case 3:
                color = "Verde";
                System.out.println(nombre + ", su color es " + color);
                inicializarFichas();
                break;
            case 4:
                color = "Azul";
                System.out.println(nombre + ", su color es " + color);
                inicializarFichas();
                break;
        }
    }

    private void inicializarFichas() {
        ficha1.figuraPosicion(color);
        ficha2.figuraPosicion(color);
        ficha3.figuraPosicion(color);
        ficha4.figuraPosicion(color);
    }

}
