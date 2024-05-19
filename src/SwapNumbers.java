public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        new SwapNumbers().swapNumber(a, b);
    }

    public void swapNumber(int a, int b) {
        int tempNumber = b;
        b = a;
        a = tempNumber;
        System.out.println("a value= "+ a + " b value = " + b);
    }


}
