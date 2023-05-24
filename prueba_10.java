import java.util.Scanner;
public class prueba_10 {
    public static void main (String [] args) {
        Scanner SC = new Scanner (System.in);
        System.out.println ("Menú de opcines");
        System.out.println ("1. Sumar.");
        System.out.println ("2. Restar.");
        System.out.println ("3. Multiplicar.");
        System.out.println ("4. Dividir.");
        System.out.println ();
        System.out.print ("Ingrese opción: ");
        int opcion = SC.nextInt();
        System.out.print ("Ingrese el primer numero: ");
        int num1 = SC.nextInt();
        System.out.print ("Ingrese el segundo numero: ");
        int num2 = SC.nextInt ();
        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println ("Error en la opción.");
                break;
        }
        System.out.println ("El resultado es: " + resultado);
    }
}