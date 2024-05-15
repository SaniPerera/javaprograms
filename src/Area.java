public class Area {

    public static double getCircleArea(int radius) {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static void main(String[] args) {
        double circleArea = getCircleArea(5);
        System.out.println("Area of circle is " + circleArea);
    }
}





