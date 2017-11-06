/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class FinalPOO1 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Dado dado1 = new Dado();
    static Dado dado2 = new Dado();
    static Random rnd = new Random();
    static Jugador p1 = new Jugador();
    static Jugador p2;
    static Jugador p3;
    static Jugador p4;
    static Maquina cpu = new Maquina();
    static Tablero tablero = new Tablero();
//    static String[] colores = {"Verde", "Amarillo", "Rojo"};

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        menu();
    }

    public static void menu() throws IOException {
        p1.namePlayer();
        juegoNormal();
        jugador2();

    }

    public static void jugador2() throws IOException {
        System.out.println("Quien va a ser tu rival?\n1. Máquina\n2. Humanos");
        int rpta = lector.nextInt();
        switch (rpta) {
            case 1:
                System.out.println("Su oponente será la máquina");
                primerTurno(p1, cpu);
                p1.seleccionarColor();
                break;
            case 2:
                p2 = new Jugador();
                p2.namePlayer();
                primerTurno(p1, p2);
                break;
        }
    }

    public static void primerTurno(Jugador p1, Jugador p2) {
        int numP1 = rifarTurno(p1);
        int numP2 = rifarTurno(p2);
        if (numP1 != numP2) {
            if (numP1 > numP2) {
                System.out.println("El primer turno es para " + p1.nombre);
            } else {
                System.out.println("El primer turno es para " + p2.nombre);
            }
        } else {
            primerTurno(p1, p2);
        }
    }

    public static void juegoNormal() {

    }

    public static int rifarTurno(Jugador player) {
        Dado dadorifa = new Dado();
        Dado dadorifa2 = new Dado();
        System.out.println("Se va a rifar el turno para " + player.nombre);
        dadorifa.valor = rnd.nextInt(6) + 1;
        dadorifa2.valor = rnd.nextInt(6) + 1;
        System.out.println("Los dados se tiraron:");
        dadorifa.pintarDado();
        dadorifa2.pintarDado();
        int sumadados = dadorifa.valor + dadorifa2.valor;
        return sumadados;
    }

}
