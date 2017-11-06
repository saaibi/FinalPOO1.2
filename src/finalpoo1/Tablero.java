/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpoo1;

/**
 *
 * @author avalencia
 */
public class Tablero {

    private final String[][] matrizParques = new String[24][4];

    private final String fichaVerde = "♙";
    private final String fichaRoja = "♔";
    private final String fichaAzul = "♘";
    private final String fichaAmarilla = "♗";

    private final String FONDO_AMARILLO = "\u001B[43m";//FONDO AMARILLO
    private final String FONDO_ROJO = "\u001B[41m";//FONDO ROJO        
    private final String FONDO_VERDE = "\u001B[42m";//FONDO VERDE        
    private final String FONDO_AZUL = "\u001B[44m";//FONDO AZUL
    private final String FONDO_BLANCO = "\u001B[47m";//FONDO BLANCO
    private final String FONDO_NEGRO = "\u001B[40m";//FONDO NEGRO

    private final String LETRA_BLANCA = "\u001B[37m";//LETRA BLANCA
    private final String LETRA_AZUL = "\u001B[34m";//LETRA AZUL
    private final String LETRA_VERDE = "\u001B[32m";//LETRA VERDE
    private final String LETRA_ROJA = "\u001B[31m";//LETRA ROJA
    private final String LETRA_AMARILLA = "\u001B[33m";//LETRA AMARILLA

    String BORRAR = "\u001B[0m"; //borrar letra y fondo

    public void inicializar() {

        String fondo = FONDO_AMARILLO;

        for (int i = 0; i < matrizParques.length; i++) {

            for (int j = 0; j < matrizParques[i].length; j++) {

                if (j == 0) {
                    fondo = FONDO_AMARILLO;
                } else if (j == 1) {
                    fondo = FONDO_ROJO;
                } else if (j == 2) {
                    fondo = FONDO_VERDE;
                } else if (j == 3) {
                    fondo = FONDO_AZUL;
                }

                matrizParques[i][j] = fondo + i + "," + j;
            }

        }

        for (String[] matrizParque : matrizParques) {
            for (String matrizParque1 : matrizParque) {
                System.out.print(matrizParque1);
            }
            System.out.println("");
        }
    }

    public void inicializar2() {

        String variable10 = fichaVerde + " " + fichaVerde + " " + fichaVerde + " " + fichaVerde;
        System.out.println("");
        String[][] matrizTablero = {{"                ZONA CIELO                    ZONA CIELO                    ZONA CIELO                    ZONA CIELO"},
        {FONDO_NEGRO + LETRA_AMARILLA + "SEGURO ZA1-CA1" + "  " + FONDO_AMARILLO + "   SEGURO   " + FONDO_AMARILLO + "  ", FONDO_NEGRO + LETRA_ROJA + "SEGURO ZR1-CR1" + "  " + FONDO_ROJO + "   SEGURO   " + FONDO_ROJO + "  ", FONDO_NEGRO + LETRA_VERDE + "SEGURO ZV1-CV1" + "  " + FONDO_VERDE + "   SEGURO  " + FONDO_VERDE + "   ", FONDO_NEGRO + LETRA_AZUL + "SEGURO ZAZ1-CA1Z" + "  " + FONDO_AZUL + "   SEGURO   " + FONDO_AZUL + "  "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA2" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA2" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA2" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA2" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA3" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA3" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA3" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA3" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA4" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA4" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA4" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA4" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA5" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA5" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA5" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA5" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA6" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA6" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA6" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA6" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA7" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA7" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA7" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA7" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "CA8" + "             " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "CA8" + "             " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "CA8" + "            " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "CA8" + "             " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {"                ZONA NO ASEGURADA             ZONA NO ASEGURADA            ZONA NO ASEGURADA              ZONA NO ASEGURADA"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA1" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR1" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV1" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ1" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA2" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR2" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV2" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ2" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA3" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR3" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV3" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ3" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA4" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR4" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV4" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ4" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {"                SALIDA                        SALIDA                        SALIDA                        SALIDA"},
        {FONDO_NEGRO + LETRA_AMARILLA + "SALIDA SA-ZSA1" + "  " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "SALIDA SA-ZSA1" + "  " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "SALIDA SA-ZSA1" + " " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + " SALIDA SA-ZSA1" + " " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {"                ZONA NO ASEGURADA               ZONA NO ASEGURADA             ZONA NO ASEGURADA              ZONA NO ASEGURADA"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA5" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR5" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV5" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ5" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA6" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR6" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV6" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ6" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA7" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR7" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV7" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ7" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA8" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR8" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV8" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ8" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA9" + "           " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR9" + "           " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV9" + "          " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ9" + "          " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA10" + "          " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR10" + "          " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV10" + "         " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ10" + "         " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {"                SEGURO                         SEGURO                         SEGURO                          SEGURO"},
        {FONDO_NEGRO + LETRA_AMARILLA + "SEGURO-A#2" + "      " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "SEGURO-R#2" + "      " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "SEGURO-V#2" + "     " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "SEGURO-AZ#2" + "     " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {"                ZONA NO ASEGURADA             ZONA NO ASEGURADA            ZONA NO ASEGURADA              ZONA NO ASEGURADA"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA11" + "          " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR11" + "          " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV11" + "         " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ11" + "         " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA12" + "          " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR12" + "          " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV12" + "         " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ12" + "         " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA13" + "          " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR13" + "          " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV13" + "         " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ13" + "         " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "},
        {"                --------------                --------------                --------------                --------------"},
        {FONDO_NEGRO + LETRA_AMARILLA + "ZNSA14" + "          " + FONDO_AMARILLO + variable10 + FONDO_AMARILLO + "     ", FONDO_NEGRO + LETRA_ROJA + "ZNSR14" + "          " + FONDO_ROJO + variable10 + FONDO_ROJO + "     ", FONDO_NEGRO + LETRA_VERDE + "ZNSV14" + "         " + FONDO_VERDE + variable10 + FONDO_VERDE + "     ", FONDO_NEGRO + LETRA_AZUL + "ZNSAZ14" + "         " + FONDO_AZUL + variable10 + FONDO_AZUL + "     "}};
        for (String[] matrizTablero1 : matrizTablero) {
            for (String matrizTablero11 : matrizTablero1) {
                System.out.print(matrizTablero11);
            }
            System.out.println("");
        }

    }

}
