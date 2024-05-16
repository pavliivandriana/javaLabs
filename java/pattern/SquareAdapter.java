package java.pattern;

class SquareAdapter implements Shape {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double getArea() {
        return square.getSide() * square.getSide();
    }
}