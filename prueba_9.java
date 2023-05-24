import java.util.Scanner;
public class prueba_9 {
    public static void main (String [] args) {
        Scanner SC = new Scanner (System.in);
        System.out.print ("Ingrese su edad: ");
        int edad = SC.nextInt ();
        boolean puedeBeber = (edad >= 18) && (edad <= 60);
        // boolean noPuedeBeber = (edad < 18) || (edad > 60);
        if (puedeBeber) {
            System.out.println ("Tu edad es de " + edad + " años.");
            System.out.println ("Puedes beber.");
        }
        else {
            System.out.println ("Tu edad es de " + edad + " años.");
            System.out.println ("No puedes beber.");
        }
    }
}