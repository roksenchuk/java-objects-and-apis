package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static void printMap_for() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("Apple", 1000);
        fruitCalories.put("Banana", 500);
        fruitCalories.put("Orange", 300);
        fruitCalories.put("Pear", 100);

        fruitCalories.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) {
        printCollection_for();
        printMap_for();
    }
}
