// 6. Write a Java program that reads a list of integers from the user 
// and throws an exception if any numbers are duplicates.

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

class a {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Please provide integers as command line arguments.");
                System.out.println("Example: java a 1 2 3 4");
                return;
            }

            int[] numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        throw new DuplicateNumberException("Duplicate number found: " + numbers[i]);
                    }
                }
            }

            System.out.println("All numbers are unique.");

        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers only.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

/*
Output:
Duplicate number found: 2
*/
