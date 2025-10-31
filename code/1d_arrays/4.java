//4. Program to print the duplicate elements of an array

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
        
        System.out.println("Duplicate elements in the array:");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // to avoid printing same duplicate again
                }
            }
        }
    }
}
// Duplicate elements in the array:
// 1
// 2
// 3
