// 5. Write a Java program that reads a file and throws an exception if the file is empty.

import java.io.*;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

class a {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                throw new FileNotFoundException("File not found!");
            }

            if (file.length() == 0) {
                throw new EmptyFileException("File is empty!");
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}

/*
Output:
File is empty!
*/
