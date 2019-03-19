import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        double salary = scr.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        double tax = 0;


        if (salary <= 2000.00) {
            System.out.println("Isento");
        } else {
            double taxableSal = salary - 2000.00;
            if (taxableSal <= 1000.00) {
                tax = low(taxableSal);
            } else if (taxableSal <= 2500.00) {
                tax = mid(taxableSal);
            } else if (taxableSal > 2500.00) {
                tax = high(taxableSal);
            }
            System.out.println("R$ " + df.format(tax));
        }
    }
    
    static double high(double ts) {
        return (((ts - 2500.00) * .28) + mid(2500));
    }

    static double mid(double ts) {
        return (((ts - 1000.00) * .18) + low(1000.00));
    }

    static double low(double ts) {
        return (ts * 0.08);
    }
 
}