package figur;

import java.util.*;
import java.util.ArrayList;

public class Main {
    static Figure[] figures = new Figure[10];

    public static void main(String[] args) {
        //initShapes();
        ArrayList<String> people = new ArrayList<String>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add("Bob");
        Collections.sort(people);
        System.out.println(people);
        //Arrays.sort(figures, Collections.reverseOrder());
        //Collections.sort(figures);
        //printShapes(figures);
    }

    private static void initShapes() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            double a = Math.random() * 100;
            int secret;
            secret = random.nextInt(3 - 1 + 1) + 1;
            ;
            if (secret == 1) {
                figures[i] = new Circle(a + i);
            }
            if (secret == 2) {
                figures[i] = new Square(a + i);
            }
            if (secret == 3) {
                figures[i] = new Triangle(3 + i, 4 + i, 5 + i);
            }
        }
    }
    private static void printShapes(Figure[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i].getName());
            System.out.println(" " + shapes[i].getArea());

        }
    }

}
