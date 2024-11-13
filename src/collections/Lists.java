package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.set(2, "Grapes");
        fruits.add("Apple");
        fruits.remove(4);

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.format("index of the first Banana is %d\n", fruits.indexOf("Banana"));
        System.out.format("index of the last Banana is %d\n", fruits.lastIndexOf("Banana"));
    }
}
