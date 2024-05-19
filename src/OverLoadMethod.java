public class OverLoadMethod {

    public void print() {
        System.out.println("I am a method without any argument");
    }

    public void print(String message) {
        System.out.println(message);
    }

    public void print(String message, String greetingName) {
        System.out.println(message + greetingName);
    }

    public static void main(String[] args) {
        OverLoadMethod overLoadMethod = new OverLoadMethod();
        overLoadMethod.print();
        overLoadMethod.print("Ok Buddy");
        overLoadMethod.print("Ok Buddy ", "Sanidu");
    }


}
