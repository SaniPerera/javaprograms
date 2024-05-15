public class Break {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i >= 20) {
                break;
            }
        }
    }
}