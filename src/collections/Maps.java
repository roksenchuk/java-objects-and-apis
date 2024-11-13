package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 150);
        fruitCalories.put("orange", 120);
        fruitCalories.put("pineapple", 150);
        fruitCalories.put("banana", 120);
        // fruitCalories.put("lemon", 17); // overrides the existing value

        System.out.println(fruitCalories);
        System.out.println("banana: " + fruitCalories.get("banana"));
    }
}
