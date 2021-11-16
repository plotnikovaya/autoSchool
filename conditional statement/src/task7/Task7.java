package task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Random newRandom = new Random();
        int secret = newRandom.nextInt(20) + 1;
        System.out.println("Введите число от 1 до 20:");
        Scanner newScanner = new Scanner(System.in);
        int number = newScanner.nextInt();

        if (number > secret || number < secret) {
            for (int counter = 7; counter> 0; --counter) {
                if (number > secret) {
                    System.out.println("Много" );
                    Scanner b = new Scanner(System.in);
                    int two = b.nextInt();
                    number = two;
                }
                else if (number < secret) {
                    System.out.println("Мало");
                    Scanner с = new Scanner(System.in);
                    int three = с.nextInt();
                    number = three;
                }
            }
            if (number == secret) {
                System.out.println("Угадал:)");
            }
        }
        if (number > secret|| number < secret) {
            System.out.println("Не угадал:(");
        }
    }
}
