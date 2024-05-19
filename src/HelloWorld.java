public class HelloWorld {


    public HelloWorld() {
        System.out.println("Hello everyone");
    }

    //Constructor overloading

    public HelloWorld(String message) {
        System.out.println(message);
    }


    public static void main(String[] args) {
        new HelloWorld();
        new HelloWorld("Ok I am in overloaded constructor");
    }
}
