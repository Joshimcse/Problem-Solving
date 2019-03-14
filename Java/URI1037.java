import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        double intvrl = scr.nextDouble();

        if (intvrl >= 0.00 && intvrl <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (intvrl > 25.00 && intvrl <= 50.00) {
            System.out.println("Intervalo (25,50]");
        } else if (intvrl > 50.00 && intvrl <= 75.00) {
            System.out.println("Intervalo (50,100]");
        } else if (intvrl > 75.00 && intvrl <= 100.00) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}