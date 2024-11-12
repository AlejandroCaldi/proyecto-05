package es.santander.ascender.proyecto05;

import java.util.Random;

public class Utilidades {

    public double arrayValorMayor(double[] arregloInicial) {

        double mayorValor = arregloInicial[0];

        for (int i = 0; i <= arregloInicial.length - 1; i++) {

            if (arregloInicial[i] > mayorValor) {

                mayorValor = arregloInicial[i];
            }

        }

        return mayorValor;
    }

    public double arrayValorMenor(double[] arregloInicial) {

        double menorValor = arregloInicial[0];

        for (int i = 0; i <= arregloInicial.length - 1; i++) {

            if (arregloInicial[i] < menorValor) {

                menorValor = arregloInicial[i];
            }

        }

        return menorValor;
    }

    public int numeroRandom(int entre) {

        entre = Math.abs(entre);  // Por algún motivo esto rompe si se le pasa un entero negativo.
        Random rn = new Random(); 
        int ran = rn.nextInt(entre);

        return ran;
    }

    public int[] listaNumerosRandom(int numeroiIndice, int entre) {

        int[] nuevalista = new int[numeroiIndice];
        for (int i = 0; i < nuevalista.length; i++) {

            nuevalista[i] = numeroRandom(entre);
        }

        return nuevalista;
    }

    public void imprimirArray(int[] arrayImprimir) {

        System.out.print("[");
        for (int i = 0; i <= arrayImprimir.length - 1; i++) {

            if (i < arrayImprimir.length) {
                System.out.print(arrayImprimir[i] + ",");
            } else {
                System.out.print(arrayImprimir[i]);
            }

        }
        System.out.print("]");
        System.out.println("\n");

    }

}
