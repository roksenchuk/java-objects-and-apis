package exceptions;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        File inputFile = new File("./resources/numbers.txt");
        File outputFile = new File("./resources/output.txt");

        try (Scanner fileReader = new Scanner(inputFile);
             PrintWriter fileWriter = new PrintWriter(outputFile)) {
            while (fileReader.hasNextLine()) {
                fileWriter.println(fileReader.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
