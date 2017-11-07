/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Jugador {

    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    Random rnd = new Random();
    String nombre, color;
    Scanner reader = new Scanner(System.in);
    Ficha ficha1 = new Ficha();
    Ficha ficha2 = new Ficha();
    Ficha ficha3 = new Ficha();
    Ficha ficha4 = new Ficha();
    String posicion;
    boolean par = false;

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

    public void menuTurno() {
        if (!ficha1.enJuego && !ficha2.enJuego && !ficha3.enJuego && !ficha4.enJuego) {
            primerTurno();
            if (par) {
                System.out.println("Sus Fichas salieron de la carcel, ahora están en salida");
                opcionesTurno(0);
            } else {
                System.out.println("Usted no sacó par\n FIN DEL TURNO.");
            }
        } else {
            turnoNormal();
        }
    }

    private void opcionesTurno(int suma) {
        System.out.println("Qué desea realizar:\n"
                + " 1. Mover Ficha.\n"
                + " 2. Pasar Turno.\n");
        if (ficha1.enJuego && ficha2.enJuego && ficha3.enJuego && ficha4.enJuego) {
            System.out.println(".");
        } else if (dado1.valor == dado2.valor) {
            System.out.println(" 3. Salir de la carcel");
        }
        int respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("¿Qué ficha desea mover?\n 1\n 2\n 3\n 4");
                int fichaMover = reader.nextInt();
                switch (fichaMover) {
                    case 1:
                        moverFicha(ficha1, suma);
                        break;
                    case 2:
                        moverFicha(ficha2, suma);
                        break;
                    case 3:
                        moverFicha(ficha3, suma);
                        break;
                    case 4:
                        moverFicha(ficha4, suma);
                        break;
                }
                break;
            case 2:
                System.out.println("Cedió el turno");
                break;
            case 3:
                if (!ficha1.enJuego) {
                    fichaEnJuego(ficha1);
                }
                if (!ficha2.enJuego) {
                    fichaEnJuego(ficha1);
                }
                if (!ficha3.enJuego) {
                    fichaEnJuego(ficha1);
                }
                if (!ficha4.enJuego) {
                    fichaEnJuego(ficha1);
                }
                break;
        }

    }

    public void primerTurno() {
        dado1.valor = rnd.nextInt(6) + 1;
        dado2.valor = rnd.nextInt(6) + 1;
        dado1.pintarDado();
        dado2.pintarDado();
        if (dado1.valor == dado2.valor) {
            fichaEnJuego(ficha1);
            fichaEnJuego(ficha2);
            fichaEnJuego(ficha3);
            fichaEnJuego(ficha4);
            par = true;
        }
    }

    public void fichaEnJuego(Ficha ficha) {
        ficha.enJuego = true;
    }

    public void fichaEnCarcel(Ficha ficha) {
        ficha.enJuego = false;
    }

    public void fichaEnCielo(Ficha ficha) {
        ficha.enJuego = false;
        ficha.corona = true;
    }

    public void turnoNormal() {
        dado1.valor = rnd.nextInt(6) + 1;
        dado2.valor = rnd.nextInt(6) + 1;
        dado1.pintarDado();
        dado2.pintarDado();
        int sumaDados = dado1.valor + dado2.valor;
        System.out.println("Su puntaje para mover es: " + sumaDados);
        opcionesTurno(sumaDados);
    }

    public void matarFicha(Ficha ficha, Jugador p2) {
        if (posicion.equalsIgnoreCase(p2.posicion)) {
            fichaEnCarcel(ficha);
            System.out.println(nombre + " mató la ficha de " + p2.nombre);
        }
    }

    private void moverFicha(Ficha ficha, int sumaDados) {
        if (ficha.posicionInicialFila + sumaDados > 23) {
            ficha.posicionColNueva = ficha.posicionInicialCol;

            int excedente = (ficha.posicionInicialFila + sumaDados) - 23;
            if (excedente > 1) {
                ficha.posicionFilaNueva = 8 + excedente;
            } else {
                ficha.posicionFilaNueva = 0;
            }

            ficha.posicionColNueva++;
            if (ficha.posicionColNueva > 3) {
                ficha.posicionColNueva = 0;
            }
            ficha.posicionInicialCol = ficha.posicionColNueva;
            ficha.posicionInicialFila = ficha.posicionFilaNueva;
            posicion = ficha.posicionFilaNueva + "," + ficha.posicionColNueva;
            System.out.println(posicion);
        }
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
