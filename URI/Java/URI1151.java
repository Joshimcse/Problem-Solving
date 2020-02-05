import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        int count = scr.nextInt();
        int first = 0, second = 1, fib;

        System.out.print(first + " " + second);

        for (int i = 2; i < count; i++) {
            fib = first + second;
            System.out.print(" " + fib);
            first = second;
            second = fib;
        }
        System.out.println();
    }
}