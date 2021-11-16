package task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int j = 0; j < m; j++)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print ("8");
            }
            System.out.print (""+"\n");
        }
    }
}