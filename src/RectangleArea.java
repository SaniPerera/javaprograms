public class RectangleArea {

    // You have to compute the Rectangle using the constructor and methods
    int beside;
    int height;

    // This is a constructor
    public RectangleArea(int beside, int height) {
        this.beside = beside;
        this.height = height;
    }

    // This is a method
    public void rectangleArea() {
        int area =  beside * height;
        System.out.println("Rectangle area is " + area);
    }


    public static void main(String[] args) {
        RectangleArea area = new RectangleArea(10, 5);
        area.rectangleArea();
    }






}
