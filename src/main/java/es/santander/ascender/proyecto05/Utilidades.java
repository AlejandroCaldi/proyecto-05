package es.santander.ascender.proyecto05;

import java.util.Random;

public class Utilidades {

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


