package Lab_7;
import java.util.Scanner;
public class Task_1 {
  	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        age = input.nextInt();
		System.out.println(age >= 16 ? "20": "10");
	}
}
