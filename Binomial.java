// Binomial Coefficient (nCr = n! / (r! * (n-r)!)

import java.util.Scanner;

public class Binomial {

    public static int factorial(int n) {
        int f = 1;
        for(int i=1;i<=n;i++) {
            f = f * i;
        }
        return f; //Factorial of n
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient =" + " " +  binCoeff(n, r));

   }
}
