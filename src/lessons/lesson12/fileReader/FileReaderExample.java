package lessons.lesson12.fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/lessons/lesson12/fileWriter/result2.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();

    }
}
