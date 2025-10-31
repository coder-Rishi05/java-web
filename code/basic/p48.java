//48. Java Program To Calculate Batting Average
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int totalRuns = sc.nextInt();
        System.out.print("Enter number of times out: ");
        int timesOut = sc.nextInt();

        if (timesOut == 0) {
            System.out.println("\nBatting average cannot be calculated (player never got out).");
        } else {
            double average = (double) totalRuns / timesOut;
            System.out.println("\nBatting Average = " + average);
        }
    }
}

/*
Output:
Enter total runs scored: 2500
Enter number of times out: 50

Batting Average = 50.0
*/