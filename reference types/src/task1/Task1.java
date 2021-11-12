package task1;

public class Task1 {
    public static void main(String[] args) {
        String str= "Строка . ";
        char firstSymbol=str.charAt(0);
        char lastSymbol=str.charAt(str.length()-1);
        System.out.println("Это первый символ: " + firstSymbol);
        System.out.println("Это последний символ: "+lastSymbol);
    }
}
