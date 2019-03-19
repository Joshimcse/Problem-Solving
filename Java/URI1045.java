import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);

        double a, b, c;
        a = scr.nextDouble();
        b = scr.nextDouble();
        c = scr.nextDouble();

        if ((a >= b + c) || (b >= c + a) || (c >= a + b))
            System.out.println("NAO FORMA TRIANGULO");
        else if ((a * a == (b * b) + (c * c)) || (b * b == (c * c) + (a * a)) || (c * c == (a * a) + (b * b)))
            System.out.println("TRIANGULO RETANGULO");
        else if ((a * a > (b * b) + (c * c)) || (b * b > (c * c) + (a * a)) || (c * c > (a * a) + (b * b)))
            System.out.println("TRIANGULO OBTUSANGULO");
        else if ((a * a < (b * b) + (c * c)) || (b * b < (c * c) + (a * a)) || (c * c < (a * a) + (b * b)))
            System.out.println("TRIANGULO ACUTANGULO");

        if ((a == b) && (b == c))
            System.out.println("TRIANGULO EQUILATERO");
        if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b))
            System.out.println("TRIANGULO ISOSCELES");
 
    }
 
}