//19. Program to print the 2nd smallest element in an array

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 40, 30};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("2nd smallest element in the array: " + secondSmallest);
    }
}
// 2nd smallest element in the array: 20

