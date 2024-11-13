package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Sorry, there is an error." + e.getMessage());
            e.printStackTrace();
        }
    }
}
