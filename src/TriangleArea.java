public class TriangleArea {
    int base;
    int height;

// This is a constructor
    public TriangleArea(int base, int height) {
        this.base = base;
        this.height = height;
    }

// This is a method
    public void triangleArea() {
        double area = (0.5) * base * height;
        System.out.println("Triangle area is " + area);
    }


    public static void main(String[] args) {
        TriangleArea area = new TriangleArea(10, 20);
        area.triangleArea();
    }






}
