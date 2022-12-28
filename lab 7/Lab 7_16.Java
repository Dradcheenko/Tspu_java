package Lab_7;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите num: ");
        double num = (new Scanner(System.in)).nextDouble();
        System.out.println((1 <= num) && (num <= 100));
        System.out.println( ((1 <= num) && (num <= 100)) || (num < 0));
    }
}
