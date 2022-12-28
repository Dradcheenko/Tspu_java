package Lab_7;
import java.util.Scanner;
public class Task_1 {
   public static void main(String[] args) {
        System.out.println("Введите age: ");
        int age = (new Scanner(System.in)).nextInt();

        System.out.println("Введите weight: ");
        int weight = (new Scanner(System.in)).nextInt();

        System.out.println("Введите height: ");
        int height = (new Scanner(System.in)).nextInt();

        System.out.println(age > 13 && age < 18);
        System.out.println(weight > 23 || height > 152);
        System.out.println((weight > 23) ^ (height > 152));
    }
}
