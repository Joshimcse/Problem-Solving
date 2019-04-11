import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int x, z, isGreater = 0;

        x = scr.nextInt();

        do {
            z = scr.nextInt();
        } while (z <= x);

        for (int i = 1; true; i++) {
            if ((isGreater += (x * 1) + (i - 1)) > z) {
                System.out.println(i);
                break;
            }
        }
    }
}