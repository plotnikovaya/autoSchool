package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= b && a >= c && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (b >= a && b >= c && a > c) {
            System.out.println(b + " " + a + " " + c);
        } else if (c >= a && c >= b && a > b) {
            System.out.println(c + " " + a + " " + b);
        } else if (a >= b && a >= c && c > b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b >= a && b >= c && c > a) {
            System.out.println(b + " " + c + " " + a);
        }
    }
}
