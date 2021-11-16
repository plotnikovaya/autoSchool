package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if (a>b){
            System.out.println(b);
        }
        else if (b>a){
            System.out.println(a);
        }
    }
}
