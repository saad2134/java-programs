// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = args[0];
        String content = "Hello, this is a file handling demonstration in Java.";

        // Writing to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

//To execute run following in command line.
//java FileHandlingDemo.java <filename>
//java FileHandlingDemo.java example.txt
