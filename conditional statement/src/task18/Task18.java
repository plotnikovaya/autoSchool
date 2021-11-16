package task18;

public class Task18 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=30;i>=0;i--) {
            Thread.sleep(100);
            System.out.println(i);
        }
        System.out.println("Бум!");
    }}