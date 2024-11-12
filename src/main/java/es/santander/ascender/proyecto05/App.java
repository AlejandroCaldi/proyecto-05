package es.santander.ascender.proyecto05;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final double[] arreglo = { -6, 1.3, 4.3, -5.9, 16.101 };
        Utilidades utilidades = new Utilidades();

        double mayor = utilidades.arrayValorMayor(arreglo);

        double menor = utilidades.arrayValorMenor(arreglo);

        int[] arregloAleatorio = utilidades.listaNumerosRandom(7, -100);

        System.out.println("El menor valor es " + menor + " y el mayor valor es " + mayor + ".");

        utilidades.imprimirArray(arregloAleatorio);
    }
}
