// 42. Program to swap two string variables without using third or temp variable.

class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swap: str1 = " + str1 + ", str2 = " + str2);

        // Swap without using a third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swap: str1 = " + str1 + ", str2 = " + str2);
    }
}

/*
 * Output:
 * Before swap: str1 = Hello, str2 = World
 * After swap: str1 = World, str2 = Hello
 */
