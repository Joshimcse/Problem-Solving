import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int startHour, endHour, startMin, endMin;
        startHour = scr.nextInt();
        startMin = scr.nextInt();
        endHour = scr.nextInt();
        endMin = scr.nextInt();

        while (startHour != 0 || startMin != 0 || endHour != 0 || endMin != 0) {

            if ((startHour == endHour) && (startMin == endMin)) {
                System.out.println(24 * 60);
            } else if ((startHour <= endHour) && (startMin <= endMin)) {
                System.out.println(((endHour - startHour) * 60) + (endMin - startMin));
            } else if ((startHour < endHour) && (startMin > endMin)) {
                System.out.println((((endHour - startHour) - 1) * 60) + (endMin + 60 - startMin));
            } else if ((startHour > endHour) && (startMin <= endMin)) {
                System.out.println(((24 - startHour + endHour) * 60) + (endMin - startMin));
            } else if ((startHour >= endHour) && (startMin > endMin)) {
                System.out.println(((23 - startHour + endHour) * 60) + (60 + endMin - startMin));
            }

            startHour = scr.nextInt();
            startMin = scr.nextInt();
            endHour = scr.nextInt();
            endMin = scr.nextInt();
        }
    }
}