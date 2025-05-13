package homework_6.geometry;

class Circle extends Figure {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
