package es.santander.ascender.proyecto05;

public class Utilidades {

    public double arrayValorMayor(double[] arregloInicial) {

        double mayorValor = arregloInicial[0];

        for (int i = 0; i<= arregloInicial.length -1;i++) {

            if (arregloInicial[i] > mayorValor) {

                mayorValor = arregloInicial[i];
            }

        }

        return mayorValor;
    }

    public double arrayValorMenor(double[] arregloInicial) {

        double menorValor = arregloInicial[0];

        for (int i = 0; i<= arregloInicial.length -1;i++) {

            if (arregloInicial[i] < menorValor) {

                menorValor = arregloInicial[i];
            }

        }

        return menorValor;
    }



}
