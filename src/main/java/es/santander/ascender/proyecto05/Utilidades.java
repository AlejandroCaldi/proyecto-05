package es.santander.ascender.proyecto05;

import java.util.Random;

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



    public   int numeroRandom(int entre) {

        
        Random rn = new Random();
        int numeroRandom = rn.nextInt(entre);

        return numeroRandom;
    }

   public int [] listaNumerosRandom(int numeroiindice ,int entre ){

      
      int [] nuevalista = new int[numeroiindice];
      for (int i = 0; i < nuevalista.length; i++) {

        nuevalista[i] = numeroRandom(entre);
      }

      return nuevalista;
    }

           

    
    
   
        
    

}


