// Write a program for sum of first n natural numbers.

import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        int i;
        int sum = 0;
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
     for(i=1;i<=number;i++) 
     {
        sum = sum + i;
     }
     System.out.println(sum);
}
}