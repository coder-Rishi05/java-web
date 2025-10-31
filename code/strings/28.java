// 28. Program to find the longest repeating sequence in a string
 
class Main {
    public static void main(String[] args) {
        String str = "aabbbccddddee"; 
        int maxLen = 1, curLen = 1;
        char maxChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curLen++; 
            } else {
                curLen = 1; 
            }

            if (curLen > maxLen) {
                maxLen = curLen; 
                maxChar = str.charAt(i); 
            }
        }

        System.out.println("Longest repeating sequence character: " + maxChar);
        System.out.println("Length of sequence: " + maxLen);
    }
}

/*
 * Output:
 * Longest repeating sequence character: d
 * Length of sequence: 4
 */
