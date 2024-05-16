public class Factorial {

    public static void main(String[] args) {
        int fact = 1;
        int i = fact;
        int number = 5;

        for ( i = 1; i <= number; i++) {
           fact = fact * i;
           // System.out.println(fact);
            // Wht is the different of "System.out.println(fact)" put on number 9 line and 13?

        }
        System.out.println(fact);

    }
}