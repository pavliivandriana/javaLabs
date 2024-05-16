package java.pattern;

class CircleAdapter implements Shape {
    private Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getArea() {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}