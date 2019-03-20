import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int in = 0, out = 0;

        while (n != 0) {
            int itv = scr.nextInt();
            if (itv >= 10 && itv <= 20) in++;
            else out++;

            n--;
        }
        System.out.print(in + " in\n" + out + " out\n");
    }
}