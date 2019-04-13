import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt(), countDay;
        double food;

        while (n-- != 0) {
            countDay = 0;
            food = scr.nextDouble();
            while (food > 1) {
                countDay++;
                food /= 2;
            }
            System.out.println(countDay + " dias");
        }
    }
}