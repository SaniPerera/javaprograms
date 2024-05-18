public class StaticMethod {

    public static void print(String input) {
        System.out.println("Welcome " + input);
    }

    public void welcomeMessage() {
        System.out.println("Welcome to Java.");
    }


    public static void main(String[] args) {
            StaticMethod.print("Sanidu");
            StaticMethod.print("Abe");
            StaticMethod staticMethod = new StaticMethod();
            staticMethod.welcomeMessage();
    }
}
