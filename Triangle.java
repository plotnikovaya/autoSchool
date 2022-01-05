package figur;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        super.name = "Triangle";
    }

    public boolean triangleRule() {
        return ((a + b < c) || (a + c < b) || (b + c < a));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printCoordinates() {
        System.out.printf("Фигура: треугольник. a = %,.2f, b = %,.2f, c = %,.2f", a, b, c);

    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}