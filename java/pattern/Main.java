package java.pattern;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);

        Shape squareAdapter = new SquareAdapter(square);
        Shape circleAdapter = new CircleAdapter(circle);

        System.out.println("Area of square: " + squareAdapter.getArea());
        System.out.println("Area of circle: " + circleAdapter.getArea());
    }
}
