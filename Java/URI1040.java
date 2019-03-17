import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scr = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1, n2, n3, n4;
        n1 = scr.nextDouble();
        n2 = scr.nextDouble();
        n3 = scr.nextDouble();
        n4 = scr.nextDouble();

        double average = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (average < 5.0) {
            System.out.println("Media: " + df.format(average));
            System.out.println("Aluno reprovado.");
        } else if (average >= 7.0) {
            System.out.println("Media: " + df.format(average));
            System.out.println("Aluno aprovado.");
        } else if (average >= 5.0 && average <= 6.9) {
            System.out.println("Media: " + df.format(average));
            System.out.println("Aluno em exame.");
            double n5 = scr.nextDouble();

            System.out.println("Nota do exame: " + df.format(n5));

            double reAverage = (average + n5) / 2;
            if (reAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.println("Media final: " + df.format(reAverage));
        }
 
    }
 
}