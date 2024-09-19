// Print All Primes in a Range

import java.util.Scanner;

public class PrintAllPrimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        for(int i=2;i<=n;i++) {
            if(isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }


}
