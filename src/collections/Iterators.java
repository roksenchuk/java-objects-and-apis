package collections;

import java.util.HashSet;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        var iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
