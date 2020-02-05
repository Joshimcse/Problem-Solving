import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);

        while (true) {
            int n = scr.nextInt();
            if (n == 0) break;
            int sumOfEven = 0;

            if (n % 2 == 0) {
                for (int i = n; i <= n + 8; i += 2) {
                    sumOfEven += i;
                }
            } else {
                for (int i = n + 1; i <= n + 9; i += 2) {
                    sumOfEven += i;
                }
            }
            System.out.println(sumOfEven);
        }
    }
}