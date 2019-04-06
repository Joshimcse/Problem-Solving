import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int x, n, sum = 0;
        x = scr.nextInt();
        
        do {
            n = scr.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            sum += x;
            x++;
        }
        System.out.println(sum);
    }
}