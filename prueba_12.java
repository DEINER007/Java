import java.util.Scanner;
public class prueba_12 {
    public static void main (String [] args) {
        System.out.println ("Programa para sumar varios números");
        Scanner SC = new Scanner (System.in);
        int acomulador = 0;
        int nuevoNumero = 0;
        while (nuevoNumero >= 0) {
            System.out.println ("Inserte un nuevo número a sumar o -1 para finalizar");
            nuevoNumero = SC.nextInt ();
            if (nuevoNumero > 0) {
                acomulador = acomulador + nuevoNumero;
            }
        }
        System.out.println ("total: " + acomulador);
    }
}