//49. Java Program to Calculate Commission Percentage
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sales amount: ");
        double totalSales = sc.nextDouble();
        System.out.print("Enter commission received: ");
        double commission = sc.nextDouble();

        if (totalSales == 0)
            System.out.println("\nCommission percentage cannot be calculated (sales is zero).");
        else {
            double commissionPercentage = (commission / totalSales) * 100;
            System.out.println("\nCommission Percentage = " + commissionPercentage + " %");
        }
    }
}

/*
Output:
Enter total sales amount: 50000
Enter commission received: 2500

Commission Percentage = 5.0 %
*/
