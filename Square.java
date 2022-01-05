package figur;

public class Square extends Figure {
    private double a;

    public Square(double a) {
        this.a = a;
        super.name = "Square";

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printCoordinates() {
        System.out.println("Фигура: квадрат. Сторона квадрата =" + a);

    }

    @Override
    public double getArea() {
        return a * a;
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