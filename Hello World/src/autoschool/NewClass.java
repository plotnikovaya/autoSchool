package autoschool;

import java.util.Scanner;

public class NewClass {
    public static void main (String args[]){
        printHelloName();
    }
    static void printHelloName() {
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        System.out.println("Hello "+str+ "!");
    }
}
