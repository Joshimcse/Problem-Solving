import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df = new DecimalFormat("0.00000");
        Scanner scr = new Scanner(System.in);

        double a = scr.nextDouble();
        double b = scr.nextDouble();
        double c = scr.nextDouble();

        if ((a == 0 || b == 0 || c == 0) || (((b * b) - (4 * a * c)) < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + df.format((-(b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a)));
            System.out.println("R2 = " + df.format((-(b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a)));
        }
 
    }
 
}