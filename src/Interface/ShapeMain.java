package Interface;

public class ShapeMain {
    public static void main(String[] args) {
        Square square = new Square(3);
        Circle circle = new Circle(2);
        System.out.println("Square area : " + square.area() + "\n" +
                "Square perimeter : " + square.perimeter());
        System.out.println("Circle area : " + circle.area() + "\n" +
                "Circle perimeter : " + circle.perimeter());
    }
}
