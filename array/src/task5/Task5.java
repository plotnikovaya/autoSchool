package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }
        int[] array = new int[10];
        int[] list = new int[10];
        array = Arrays.copyOfRange(numbers, 0, 9);
        list = Arrays.copyOfRange(numbers, 10, 20);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);}
    }
}