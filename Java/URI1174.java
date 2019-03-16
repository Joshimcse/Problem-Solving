import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner scr = new Scanner(System.in);
        Double[] a = new Double[100];

        for (int i = 0; i < 100; i++) {
            a[i] = scr.nextDouble();
            if (a[i] <= 10.0) {
                System.out.println("A[" + i + "] = " + df.format(a[i]));
            }
        }
 
    }
 
}