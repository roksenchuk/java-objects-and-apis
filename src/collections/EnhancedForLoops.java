package collections;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
