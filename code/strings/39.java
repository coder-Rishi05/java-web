// 39. Program to replace the spaces of a string with a specific character

class Main {
    public static void main(String[] args) {
        String str = "Java is easy to learn";
        char replaceWith = '-'; // character to replace spaces

        // Replace all spaces with the specified character
        String result = str.replace(' ', replaceWith);

        System.out.println("After replacing spaces: " + result);
    }
}

/*
 * Output:
 * After replacing spaces: Java-is-easy-to-learn
 */
