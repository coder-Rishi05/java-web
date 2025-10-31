//15. Write a Java program to display the system time
import java.time.*;

class Main {
    public static void main(String args[]) {
        LocalTime lc = LocalTime.now();
        System.out.println("Hours:Minutes:Seconds.NanoSeconds");
        System.out.println("HH:MM:SS.NS");
        System.out.println(lc);
    }
}

/*
Output:
Hours:Minutes:Seconds.NanoSeconds
HH:MM:SS.NS
14:36:52.789654300
(Note: The actual time will vary depending on when the program is executed.)
*/
