package task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name= in.nextLine();
        int age=in.nextInt();
        if (age<18){
            System.out.println(name+", подрасти ещё");
        }
    }
}
