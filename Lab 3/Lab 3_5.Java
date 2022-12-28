package Lab_3;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a,c: ");
        double a = in.nextInt();
        double c = in.nextInt();
        double b = Math.sqrt(c*c - a*a);
        System.out.println(b);
    }
    
}
