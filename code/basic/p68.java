//68. Write a Java program to create a simple calculator
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("<-------- CALCULATOR -------->");
            System.out.println("Press -> 1 For ADDITION");
            System.out.println("Press -> 2 For SUBTRACTION"); 
            System.out.println("Press -> 3 For MULTIPLICATION");
            System.out.println("Press -> 4 For DIVISION");
            System.out.println("Press -> 5 For EXPONENTIAL");
            System.out.println("Press -> 6 For EXIT");
            System.out.print("What do you want to do? ");
            
            int n = sc.nextInt();
            
            if (n == 6)
            {
                System.out.println("Exiting Calculator... Goodbye!");
                break;
            }

            if (n >= 1 && n <= 5)
            {
                System.out.print("Enter the 1st number: ");
                double a = sc.nextDouble(); 
                System.out.print("Enter the 2nd number: ");
                double b = sc.nextDouble(); 
                
                switch (n)
                {
                    case 1 -> System.out.println("\nAddition of " + a + " and " + b + " is " + (a + b));
                    case 2 -> System.out.println("\nSubtraction of " + a + " by " + b + " is " + (a - b));
                    case 3 -> System.out.println("\nMultiplication of " + a + " by " + b + " is " + (a * b));
                    case 4 -> {
                        if (b != 0)
                            System.out.println("\nDivision of " + a + " by " + b + " is " + (a / b));
                        else
                            System.out.println("\nError: Division by zero is not allowed!");
                    }
                    case 5 -> System.out.println("\nPower of " + a + " raised to " + b + " is " + Math.pow(a, b));
                }
                System.out.println(); // For spacing
            }
            else
                System.out.println("Please enter a valid option!\n");
        }
    }
}

/*
Output:
<-------- CALCULATOR -------->
Press -> 1 For ADDITION
Press -> 2 For SUBTRACTION
Press -> 3 For MULTIPLICATION
Press -> 4 For DIVISION
Press -> 5 For EXPONENTIAL
Press -> 6 For EXIT
What do you want to do? 1
Enter the 1st number: 15
Enter the 2nd number: 10

Addition of 15.0 and 10.0 is 25.0
*/
