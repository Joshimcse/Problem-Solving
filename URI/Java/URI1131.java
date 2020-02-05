import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int inter = 0, gremio = 0, empates = 0, grenais = 0;

        while (true) {
            grenais++;

            int i;
            int x, y;
            x = scr.nextInt();
            y = scr.nextInt();

            if (x > y) inter++;
            else if (x < y) gremio++;
            else empates++;

            do {
                System.out.println("Novo grenal (1-sim 2-nao)");
                i = scr.nextInt();
            } while (i != 1 && i != 2);

            if (i == 2) {
                break;
            }
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (inter < gremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}