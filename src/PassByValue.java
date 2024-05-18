public class PassByValue {


    public void print(String temp) {
        System.out.println("Welcome " + temp);
    }


    public static void main(String[] args) {
        PassByValue passByValue = new PassByValue();  // This is object
        passByValue.print("Sanidu");
        passByValue.print("Abe");
    }



}
