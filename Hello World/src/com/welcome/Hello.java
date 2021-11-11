package com.welcome;

import java.util.Scanner;

public class Hello {
    public static String name = " ";

    public static String setupName()
    {
        System.out.println("Enter your name: ");
        Scanner in =new Scanner(System.in);
        name = in.nextLine();
        return name;
    }

    public static void welcome() {
        System.out.println("Hello " + name + "!");
    }

    public static void byeBye() {

        System.out.println("Bye " + name + "!");

    }
}

