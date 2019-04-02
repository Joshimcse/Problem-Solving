import java.io.IOException;
import java.text.DecimalFormat; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df1 = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("0");

        for (double i = 0; i <= 2.01; i += .2) {
            double check = Double.parseDouble(df1.format(i));
            for (double j = 1; j <= 3; j++) {
                if (check == 0 || check == 1 || check == 2) {
                    System.out.println("I=" + df2.format(i) + " J=" + df2.format(i + j));
                } else {
                    System.out.println("I=" + df1.format(i) + " J=" + df1.format(i + j));
                }
            }
        }
    }
}