//18. Program to print the largest element in an array

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 40, 30};

        int largest = arr[0]; // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}
// Largest element in the array: 50

