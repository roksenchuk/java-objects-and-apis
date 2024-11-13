package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class TryCatch {

    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Sorry, there is an error." + e.getMessage());
            e.printStackTrace();
        } finally {
            file.delete();
        }
    }
}
