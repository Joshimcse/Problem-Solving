import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        while (n != 0) {
            int x = scr.nextInt();
            int y = scr.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(df.format((double) x / y));
            }
            n--;
        }
    }
}