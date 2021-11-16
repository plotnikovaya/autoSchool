package task6;

import java.util.Scanner;

public class Task6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String name= in.nextLine();
            int age=in.nextInt();
            if (age>20){
                System.out.println(name+", и 18 достаточно");
            }
        }
    }
