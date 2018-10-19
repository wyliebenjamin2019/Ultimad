public class Ultimad{
    public static void main(String[] args){

        int time = 67294091;

        int year = (time/(24*60*365));

        int remainder = (time-(year*365*24*60));

        int day = (remainder/(24*60));

        int remainder2 = (time-(year*365*24*60+(day*24*60)));

        int hour = ((remainder2)/60);

        int minute = (time-(year*365*24*60+(day*24*60+(hour*60))));

        int worlddays = time/(60*24);
        int trammelcycle = worlddays/9;
        int trammelday = worlddays-(9*trammelcycle);

        int feluccacycle = worlddays/14;
        int feluccaday = worlddays-(14*feluccacycle);

        int realyear = year+1;
        int realday = day+1;
        int realtrammelday = trammelday+1;
        int realfeluccaday = feluccaday+1;

        System.out.println("worldTime = "+time+"\nIt is "+hour+":"+minute+" on day "+realday+" of the year "+realyear);
        System.out.println("Trammel is in day "+realtrammelday+" of its 9 day phase.");
        System.out.println("Felucca is in day "+realfeluccaday+" of its 14 day phase.");

        // OUTPUTS
        // worldTime = 168260271
        //   It is 9:51 on day 48 of the year 321
        //   Trammel is in day 1 of its 9 day cycle.
        //   Felucca is in day 4 of its 14 day cycle.

        //  worldTime = 27364375
        //  It is 0:55 on day 24 of the year 53
        //  Trammel is in day 5 of its 9 day phase.
        //  Felucca is in day 6 of its 14 day phase.

        //  worldTime = 67294091
        //  It is 0:11 on day 13 of the year 129
        //  Trammel is in day 5 of its 9 day phase.
        //  Felucca is in day 1 of its 14 day phase.

    }
}
