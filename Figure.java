package figur;

import java.util.Comparator;

public abstract class Figure implements Comparator, Comparable {
    protected String name;
    protected double area;

    public String getName() {
        return name;
    }


    public int compareTo(Figure d) {
        return (this.name).compareTo(d.name);
    }
    public double compare(Figure d, Figure d1) {
        return (double) (d.area - d1.area);
    }


    public void printCoordinates() {


    }

    public void setName(String name) {
        this.name = name;

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}