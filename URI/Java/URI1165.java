import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt(), x;
        while (n != 0) {
            x = scr.nextInt();

            if (isPrime(x) == 1) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
            n--;
        }
    }

    static int isPrime(int x) {
        if (x < 2) return 0;
        if (x == 2 || x == 3 || x == 5 || x == 7) return 1;
        if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0) return 0;

        int sr = (int) Math.sqrt(x) + 1;
        for (int i = 11; i <= sr; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}