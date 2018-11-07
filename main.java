import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static int worldTime, hour, min, day, year, trammelcycle, feluccacycle;

    public static void main(String[] args) {
        time();
        System.out.println(" ");
        time();
        System.out.println(" ");
        time();
    }
    public static void time(){
        original();
        System.out.println();
        hour = hourTime(hour);
        min = minuteTime(min);
        day = dayTime(day);
        year = yearTime(year);
        trammelcycle = tramTime(trammelcycle);
        feluccacycle = feluTime(feluccacycle);
        print();
    }
    public static void original() {
        System.out.print("Time: ");
        sc = new Scanner(System.in);
        worldTime = sc.nextInt();
    }
    public static int hourTime(int hour) {
        hour = ((worldTime / 60) % 24);
        return (hour);
    }

    public static int minuteTime(int min) {
        min = worldTime % 60;
        return (min);
    }

    public static int dayTime(int day) {
        day = ((worldTime / 1440) % 365) + 1;
        return (day);
    }

    public static int yearTime(int year) {
        year = (worldTime / 1440 / 365) + 1;
        return (year);
    }

    public static int tramTime(int tDayOutput) {
        tDayOutput = ((worldTime / 1440) + 1) % 9;
        return (tDayOutput);
    }

    public static int feluTime(int fDayOutput) {
        fDayOutput = ((worldTime / 1440) + 1) % 14;
        return (fDayOutput);
    }

    public static void print() {
        System.out.println("worldTime: " + worldTime);
        System.out.print("It is " + hour + ":");
        System.out.printf("%02d ", min);
        System.out.println("on day " + day + " of the year " + year + ".");
        System.out.println("Trammel is in day " + trammelcycle + " of its 9 day cycle.");
        System.out.println("Felucca is in day " + feluccacycle + " of its 14 day cycle.");
    }
}
