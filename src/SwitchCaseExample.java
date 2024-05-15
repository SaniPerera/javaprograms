public class SwitchCaseExample {

    public static void main(String[] args) {

        int grade = 4;

        switch(grade) {
            case 1:
                System.out.println("You got bad grades");
                break;
            case 2:
                System.out.println("You are doing good.");
                break;
            case 3:
                System.out.println("You are a good student");
                break;
            case 4:
                System.out.println("You are bright student");
                break;
            case 5:
                System.out.println("You are excellent");
                break;
            default:
                System.out.println("Not a grade from defined values");


        }


    }

}
