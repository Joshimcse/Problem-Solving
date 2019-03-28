import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int i = 0;
        double score = 0;

        while (i < 2) {
            double x = scr.nextDouble();

            if (x >= 0.0 && x <= 10.) {
                score += x;
                i++;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.println("media = " + score / 2);
    }
}