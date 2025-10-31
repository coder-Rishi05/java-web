//12. Program to print the sum of all the items of the array

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}
// Sum of all elements in the array: 150
