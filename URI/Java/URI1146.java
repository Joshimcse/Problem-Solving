import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);

        while (true) {
            int n = scr.nextInt();
            if (n == 0) break;
            for (int i = 1; i < n; i++) {
                System.out.print(i + " ");
            }
            System.out.println(n);
        }
    }
}