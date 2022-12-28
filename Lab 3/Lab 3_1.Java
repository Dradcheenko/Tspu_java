public class Main {
    static int b=2;
    static void stepen (int n) {
        int result =1;
        for (int i=0; i<n; i++) {
            result*=b;
        }
        System.out.println(result);
    }

    public static void main (String[] args) {
        stepen (3);
    }

}