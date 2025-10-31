// 27. Program to find the largest and smallest word in a string
 
class Main {
    public static void main(String[] args) {
        String str = "This is the winter season of this year. ";
        String[] words = str.split(" "); 

        String largest = words[0];
        String smallest = words[0];

        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word; 
            }
            if (word.length() < smallest.length()) {
                smallest = word; 
            }
        }

        System.out.println("Largest word: " + largest);
        System.out.println("Smallest word: " + smallest);
    }
}

/*
 * Output:
 * Largest word: season
 * Smallest word: is
 */
