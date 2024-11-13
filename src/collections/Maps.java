package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 150);
        fruitCalories.put("orange", 120);
        fruitCalories.put("pineapple", 150);
        fruitCalories.put("pineapple", 120);

        System.out.println(fruitCalories);
    }
}
