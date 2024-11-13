package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        // adding the duplicate element
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.remove("apple"));
        System.out.println(fruits.size());

        // returns the immutable entity of the Set
        Set moreFruits = Set.of("apple", "orange", "banana");
        System.out.println(moreFruits);
    }
}
