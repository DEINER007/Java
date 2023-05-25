import java.util.Scanner;
public class prueba_14 {
    static int [] array = new int [5];
    static Scanner SC  = new Scanner (System.in);
    public static void main (String [] args) {
        insertarDatosArray ();
        sumarArray ();
        maxArray ();
        promedioArray ();
    }
    private static void insertarDatosArray () {
        for (int i = 0; i < array.length; i++) {
            System.out.print ("Insertar array [" + i + "]= ");
            array [i] = SC.nextInt ();
        }
    }
    private static void sumarArray () {
        System.out.print ("Sumar= ");
        int acomulador = 0;
        for (int i = 0; i < array.length; i++) {
            acomulador = acomulador + array [i];
            System.out.print (" + " + array [i]);
        }
        System.out.print (" = " + acomulador + "\n");
    }
    private static void maxArray () {
        System.out.print ("Maximo= ");
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max) {
                max = array [i];
            }
        }
        System.out.println (max);
    }
    private static void promedioArray () {
        System.out.print ("Promedio= ");
        double promedio = 0;
        for (int i = 0; i < array.length; i++) {
            promedio = promedio + array [i];
        }
        promedio = promedio / array.length;
        System.out.println (promedio);
    }
}