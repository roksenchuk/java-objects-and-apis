package collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambdas {
    public static void printCollection_for() {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
    }

    public static void main(String[] args) {
        printCollection_for();
    }
}
