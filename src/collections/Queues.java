package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("grape");
        var removed = fruits.remove();

        System.out.println(fruits);
        System.out.println("removed one is: " + removed);
        System.out.println("the head of the queue is: " + fruits.peek());
    }
}
