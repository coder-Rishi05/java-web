// 25. Program to find the duplicate words in a string

class Main {
    public static void main(String[] args) {
        String str = "this is a test this is only a test";
        str = str.toLowerCase();

        String[] words = str.split(" ");
        int count;

        System.out.println("Duplicate words in the string:");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            if (words[i].equals("0"))
                continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if (count > 1)
                System.out.println(words[i] + " - " + count + " times");
        }
    }
}

/*
 * Output:
 * Duplicate words in the string:
 * this - 2 times
 * is - 2 times
 * a - 2 times
 * test - 2 times
 */
