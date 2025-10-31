/*
25. Create a class, entering the command line arguments from the user and show all the arguments as output.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Line Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}

/*
Sample Output:
> java Main Sachin Komal BCA
Command Line Arguments:
Argument 1: Sachin
Argument 2: Komal
Argument 3: BCA
*/
