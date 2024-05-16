public class LearningMethods {


    //Method or function

    /*
     * This method return the reverse of the provided number
     * @param inputNumber
     * @return
     */
    public int reverseNumber(int inputNumber) {
        int reverseNumber = 0;
        while(inputNumber > 0) {
            int remainder = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            inputNumber = inputNumber /10;
        }
        return reverseNumber;
    }

    public void printTable(int number) {
        for (int i = 1; i<=10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }


    public static void main(String[] args) {
        // Creating an object of this class.
        LearningMethods learningMethods = new LearningMethods();

        int reversedNumber = learningMethods.reverseNumber(876543);

        learningMethods.printTable(8);
        learningMethods.printTable(7);
        learningMethods.printTable(34);


        System.out.println(reversedNumber);


    }
}