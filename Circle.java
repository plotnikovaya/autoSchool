package figur;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
        super.name = "Circle";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
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
