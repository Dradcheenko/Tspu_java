package Lab_3;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        int result = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result*i;
        }
       
        System.out.println(result);
    }
    
}
