import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i;
        int r = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            r = (r * 10) + lastDigit;
            n = n / 10;

        }
        System.out.println(r);

    }

}
