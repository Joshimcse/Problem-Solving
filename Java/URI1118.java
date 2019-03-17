import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scr = new Scanner(System.in);

        while (true) {
            int i = 0;
            double score = 0;
            while (i < 2) {
                double x = scr.nextDouble();
                if (x >= 0 && x <= 10) {
                    score += x;
                    i++;
                } else {
                    System.out.println("nota invalida");
                }
            }
            System.out.println("media = " + df.format(score / 2));

            int isContinue;
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                isContinue = scr.nextInt();
            } while (isContinue != 1 && isContinue != 2);
            if (isContinue == 1) {
                continue;
            } else {
                break;
            }
        }
 
    }
 
}