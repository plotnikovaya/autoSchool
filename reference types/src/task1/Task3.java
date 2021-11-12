package task1;
public class Task3 {
    static String max(String par) {
        String[] words = par.split(" ");
        String str= "";
        for (String word : words) {
            if (word.length() > str.length())
                str = word;
        }
        return (str);
    }
    static public void main(String [] args) {
        String txt = "Что такое осень";
        System.out.println(max(txt));
        System.out.println(max(txt).length());
    }
}