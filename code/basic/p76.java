// 76. Write a Java program to print current date and time in the specified format
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = current.format(formatter);
        System.out.println("Current Date and Time: " + formatted);
    }
}

/*
Output:
Current Date and Time: 30-10-2025 23:48:12
*/
