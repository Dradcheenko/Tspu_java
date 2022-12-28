package Lab_7;
import java.util.Scanner;
public class Task_1 {
  public static void main(String[] args) {
        System.out.println("Введите age: ");
        byte age = (new Scanner(System.in)).nextByte();
        if (age < 18)
            System.out.println
                    ("Нельзя получить кредит");
        else
            System.out.println
                    ("Можно получить кредит ");
    }
}
