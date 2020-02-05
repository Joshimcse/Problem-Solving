import java.io.IOException;
import java.util.Scanner; 
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int n, count;
        long a, b;
        double ag, bg;

        n = scr.nextInt();

        while (n > 0) {
            a = scr.nextInt();
            b = scr.nextInt();
            ag = scr.nextDouble();
            bg = scr.nextDouble();

            count = 0;

            while (a <= b) {
                a += (a * ag) / 100;
                b += (b * bg) / 100;

                if (++count > 100) break;
            }

            if (count <= 100) System.out.println(count + " anos.");
            else System.out.println("Mais de 1 seculo.");

            n--;
        }
    }
}