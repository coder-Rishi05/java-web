130. Write a Java method to displays prime numbers between 1 to 20

public class PrimeNumbers {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i=2; i<=num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 20: ");
        for (int i=2; i<=20; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
output:-
        Prime numbers between 1 and 20: 2 3 5 7 11 13 17 19 
        