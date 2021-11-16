package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name= in.nextLine();
        String name2=in.nextLine();
    if (name.equals(name2)){
        System.out.println("Имена идентичны");}
    else if (name.length()==name2.length()){
        System.out.println("Длины имен равны");
    }
    }
}
