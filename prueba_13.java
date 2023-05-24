public class prueba_13 {
    public static void main(String [] args) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.println (array [i] + ",");
        }
        System.out.println ("Incremtamos en uno.");
        for (int i = 0; i < array.length; i++) {
            array [i] ++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print (array [i] + ",");
        }
    }
}
