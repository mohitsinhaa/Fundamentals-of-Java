import java.util.Scanner;

public class ProductFun {
    public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        mul(a,b);
    }

    public static void mul(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }
}
