// 35. Program to Print even length words

class Main {
    public static void main(String[] args) {
        String str = "Java is very easy to learn";

        // Split the string into words
        String[] words = str.split(" ");

        // Check each word
        for (String word : words) {
            if (word.length() % 2 == 0) {  // even length check
                System.out.println(word);
            }
        }
    }
}

/*
 * Output:
 * Java
 * is
 * very
 * to
 */
