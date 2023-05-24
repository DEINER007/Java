import java.util.Scanner;
public class prueba_8 {
    public static void main (String [] args) {
        Scanner SC = new Scanner (System.in);
        System.out.print ("Ingrese su edad: ");
        int edad = SC.nextInt ();
        if (edad >= 18) {
            System.out.println ("Tu tienes es de " + edad +" años.");
            System.out.println ("Si puedes beber.");
        }
        else {
            System.out.println ("Tu edad es de " + edad + " años.");
            System.out.println ("No puedes beber.");
        }
    }
}