import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int x, y, count = 0;
        x = scr.nextInt();
        y = scr.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            count++;
            if (count == x) {
                System.out.println();
                count = 0;
            } else System.out.print(" ");
        }
    }
}