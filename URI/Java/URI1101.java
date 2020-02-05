import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int x, y, sum;
        do {
            x = scr.nextInt();
            y = scr.nextInt();
            if (x <= 0 || y <= 0) break;
            sum = 0;

            if (x > y) {
                for (int i = y; i <= x; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }
            } else {
                for (int i = x; i <= y; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println("Sum=" + sum);
        } while (true);
    }
}