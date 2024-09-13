public class SwapFun {

    public static void main (String args[]) {
        int a = 5;
        int b = 10;
        swap(a,b);
    }

    public static void swap(int x, int y) {
      int temp = x;
      x = y;
      y = temp;
      System.out.println(x);
      System.out.println(y);
    }

}
