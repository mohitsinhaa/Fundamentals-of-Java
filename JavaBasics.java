import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
      float pencil = sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser = sc.nextFloat();
      float total = pencil + pen + eraser;
      double gst = 0.18 * total;
      double bill = total + gst;
      
      
    System.out.println("GST =" + gst + " " + "TOTAL BILL = " + bill);
    }
}