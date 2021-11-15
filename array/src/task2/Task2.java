package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String[] list = new String[10];
        int n = list.length;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
