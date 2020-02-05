import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt(), sqr;
        long kg;

        while (n-- != 0) {
            sqr = scr.nextInt();
            kg = (long) ((Math.pow(2, sqr) - 1) / 12) / 1000;
            System.out.println(kg + " kg");
        } 
    }
 
}