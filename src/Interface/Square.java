package Interface;

class Square implements Shape {
    double side;

    Square(double s){
        side = s;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
