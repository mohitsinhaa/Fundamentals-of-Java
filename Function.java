// A function is a block of code designed to perform a specific task. 
// It is a reusable piece of code that can be called multiple times throughout a program. 
// Functions help in organizing code, improving readability, and promoting code reuse.

public class Function {
    public static void main (String args[]) {
        int a = 5;
        int b = 3;
        int c = sum(a, b); 
        System.out.println(c);
    }
    
    public static int sum(int a, int b) { 
        return a + b;
    }
}
