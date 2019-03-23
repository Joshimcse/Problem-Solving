import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);

        int pos = 0, highest = 0;

        for (int i = 1; i <= 100; i++) {
            int inp = scr.nextInt();
            if (inp > highest) {
                highest = inp;
                pos = i;
            }
        }
        System.out.print(highest + "\n" + pos + "\n");
 
    }
 
}