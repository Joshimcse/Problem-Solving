import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scr = new Scanner(System.in);
        int n, amount, count = 0, total = 0, c = 0, r = 0, s = 0;
        char animal;

        n = scr.nextInt();
        for (int i = 0; i < n; i++) {
            amount = scr.nextInt();
            animal = scr.next().charAt(0);

            if (animal == 'C' || animal == 'R' || animal == 'S') {
                total += amount;
                switch (animal) {
                    case 'C':
                        c += amount;
                        break;
                    case 'R':
                        r += amount;
                        break;
                    case 'S':
                        s += amount;
                        break;
                }
            }
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);

        System.out.println("Percentual de coelhos: " + df.format((double) (100 * c) / total) + " %");
        System.out.println("Percentual de ratos: " + df.format((double) (100 * r) / total) + " %");
        System.out.println("Percentual de sapos: " + df.format((double) (100 * s) / total) + " %");
 
    }
 
}