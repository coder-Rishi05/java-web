//17. Write a Java program to print the even numbers from 1 to 20
class Main {
    public static void main(String args[]) {
        int i = 2, n = 22;
        System.out.println("Even Numbers from 1 to " + (n - 2));
        while (i != n) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}

/*
Output:
Even Numbers from 1 to 20
2 4 6 8 10 12 14 16 18 20
*/
