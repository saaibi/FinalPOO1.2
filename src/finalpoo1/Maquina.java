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
public class Maquina extends Jugador {

    public Maquina() {
        super.nombre = "CPU";
    }

    @Override
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

    @Override
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
            posicion = "";
            par = true;
        }
    }

    private void opcionesTurno(int suma) {
        if (ficha1.enJuego && ficha2.enJuego && ficha3.enJuego && ficha4.enJuego) {
            System.out.println(".");
        } else if (dado1.valor == dado2.valor) {
            if (!ficha1.enJuego) {
                fichaEnJuego(ficha1);
            }
            if (!ficha2.enJuego) {
                fichaEnJuego(ficha2);
            }
            if (!ficha3.enJuego) {
                fichaEnJuego(ficha3);
            }
            if (!ficha4.enJuego) {
                fichaEnJuego(ficha4);
            }
        }
        System.out.println("Movió ficha");
        if (!ficha1.corona || ficha1.enJuego) {
            moverFicha(ficha1, suma);
        } else if (!ficha2.corona || ficha2.enJuego) {
            moverFicha(ficha2, suma);
        } else if (!ficha3.corona || ficha3.enJuego) {
            moverFicha(ficha3, suma);
        } else if (!ficha4.corona || ficha4.enJuego) {
            moverFicha(ficha4, suma);
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
            posicion = ficha.posicionFilaNueva + "," + ficha.posicionColNueva;
            System.out.println(posicion);
        }
    }

    public void color() {
        int randomColor = rnd.nextInt(4) + 1;
        System.out.println("La màquina escogiò el color " + color);
    }

    private void inicializarFichas() {
        ficha1.figuraPosicion(color);
        ficha2.figuraPosicion(color);
        ficha3.figuraPosicion(color);
        ficha4.figuraPosicion(color);
    }
}
