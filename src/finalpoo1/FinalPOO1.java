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
    static String[] colores = {"Azul", "Verde", "Amarillo", "Rojo"};
    static Tablero tablero = new Tablero();

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("\u260B");
        String myUnicodeSymbol = "\u05D0";
        System.out.println(myUnicodeSymbol);
        menu();

    }

    public static void menu() throws IOException {
        namePlayer(p1);
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
                break;
            case 2:
                System.out.println("Cuaántos jugadores aparte de usted hay?\n(1-3)");
                int numjug = lector.nextInt();
                switch (numjug) {
                    case 1:
                        p2 = new Jugador();
                        namePlayer(p2);
                        primerTurno(p1, p2);
                        break;
                    case 2:
                        p2 = new Jugador();
                        p3 = new Jugador();
                        namePlayer(p2);
                        namePlayer(p3);
                        break;
                    case 3:
                        p2 = new Jugador();
                        p3 = new Jugador();
                        p4 = new Jugador();
                        namePlayer(p2);
                        namePlayer(p3);
                        namePlayer(p4);
                        break;
                }
                break;
            default:
                break;
        }
    }

    public static void primerTurno(Jugador p1, Jugador p2) {
        if (rifarTurno(p1) > rifarTurno(p2)) {
            System.out.println("El primer turno es para " + p1.nombre);
        } else {
            System.out.println("El primer turno es para " + p2.nombre);
        }
    }

    public static void namePlayer(Jugador player) throws IOException {
        System.out.println("Por favor ingrese su nombre:");
        player.nombre = reader.readLine();
    }

    public static void juegoPP() {

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

    public static void seleccionarColor(Jugador player) throws IOException {
        String color;
        System.out.println(player.nombre + " selecionnee un color:\n1. Amarillo\n2. Rojo\n3. Azul\n4. Verde");
        int colorSelecionado = reader.read();
        switch (colorSelecionado) {
            case 1:
                color = "Amarillo";
                colorPicked(color, player);
                break;
            case 2:
                color = "Rojo";
                colorPicked(color, player);
                break;
            case 3:
                color = "Azul";
                colorPicked(color, player);

                break;
            case 4:
                color = "Verde";
                colorPicked(color, player);

                break;
        }
    }

    public static void colorPicked(String color, Jugador player) {
        for (String colore : colores) {
            if (color.equalsIgnoreCase(colore)) {
                colore = "X";
            }
        }
        player.color = color;
    }

}
