import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        String str;
        int startDay, endDay, startHour, endHour, startMinute, endMinute, startSecond, endSecond;
        int day, hour, minute, second, startTotalInSecond, endTotalInSecond;

        str = scr.next();             // Input Dia
        startDay = scr.nextInt();

        startHour = scr.nextInt();
        str = scr.next();             // Input 2nd :
        startMinute = scr.nextInt();
        str = scr.next();             // Input 2nd :
        startSecond = scr.nextInt();

        //-----------------------------------------------

        str = scr.next();             // Input Dia
        endDay = scr.nextInt();

        endHour = scr.nextInt();
        str = scr.next();             // Input 2nd :
        endMinute = scr.nextInt();
        str = scr.next();             // Input 2nd :
        endSecond = scr.nextInt();


        startTotalInSecond = (startDay * 86400) + (startHour * 3600) + (startMinute * 60) + startSecond;
        endTotalInSecond = (endDay * 86400) + (endHour * 3600) + (endMinute * 60) + endSecond;

        day = (endTotalInSecond - startTotalInSecond) / 86400;
        hour = ((endTotalInSecond - startTotalInSecond) - (day * 86400)) / 3600;
        minute = (((endTotalInSecond - startTotalInSecond) - (day * 86400)) - (hour * 3600)) / 60;
        second = (((endTotalInSecond - startTotalInSecond) - (day * 86400)) - (hour * 3600)) - (minute * 60);

        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(second + " segundo(s)");
    }
}