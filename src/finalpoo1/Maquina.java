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

    public void turnoNormal() {
        dado1.valor = rnd.nextInt(6) + 1;
        dado2.valor = rnd.nextInt(6) + 1;
        dado1.pintarDado();
        dado2.pintarDado();
        int sumaDados = dado1.valor + dado2.valor;
        System.out.println("Su puntaje para mover es: " + sumaDados);
        opcionesTurno(sumaDados);
    }

    private void opcionesTurno(int suma) {
        if (ficha1.enJuego && ficha2.enJuego && ficha3.enJuego && ficha4.enJuego) {
            System.out.println(".");
        } else if (dado1.valor == dado2.valor) {
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
        }
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
}
