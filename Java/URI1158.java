import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int n, x, y, sum;

        n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            x = scr.nextInt();
            y = scr.nextInt();
            if (x % 2 == 1 || x % 2 == -1)
                System.out.println((x * y) + (y * (y - 1)));   
            else
                System.out.println(((x + 1) * y) + (y * (y - 1)));
        }
    }
}