public class MyMethodEx {

    public static void print(int Double) {
            System.out.println(5.4+Double);


    }

    public static void reverseNumber(int inputnumber) {
        int reverseNumber = 0;
        while (inputnumber > 0) {
            int remainder = inputnumber % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            inputnumber = inputnumber / 10;


        }
        System.out.println( reverseNumber);


    }



        public static void main (String[]args){

            MyMethodEx.print(5);
            MyMethodEx.reverseNumber(12345);


        }

}