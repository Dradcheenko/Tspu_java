package Lab_3;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        double g = 9.8;
        Scanner in = new Scanner(System.in);
        System.out.println("enter h: ");
        double h = in.nextInt();
        double t = Math.sqrt(2*h/g);
        System.out.println(t);    
    }
}
