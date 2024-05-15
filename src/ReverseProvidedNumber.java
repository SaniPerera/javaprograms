public class ReverseProvidedNumber {


    public static void main(String[] args) {
        //1234 - 4321
        //6078 - 8706
        //456789 - 987654
        // difference between (% and /)

        int number = 12345;
        int reverseNumber = 0;

        while(number > 0) {
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number = number /10;
        }
        System.out.println(reverseNumber);



    }


}
