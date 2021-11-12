package task1;

import java.util.Scanner;

public class Task2 {
    public static String text = " ";
    public static String exchange = " ";
    public static String renewal = " ";

    public static void main(String[] args) {
        enterText();
        textReplacement();
        Paste();
    }
    public static String enterText() {
        System.out.println("Enter your text: ");
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
        return text;
    }
    public static String textReplacement() {
        System.out.println("Enter the word you want to replace: ");
        Scanner in = new Scanner(System.in);
        exchange = in.nextLine();
        return exchange;
    }
    public static void Paste() {
        System.out.println("Enter the new word: ");
        Scanner in = new Scanner(System.in);
        String newWord = in.nextLine();
        String resultText = text.replaceAll(exchange, newWord);
        System.out.println(resultText);
    }
}