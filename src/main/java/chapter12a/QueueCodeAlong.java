package chapter12a;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCodeAlong {
    /*
    Queues hold items to be processes.

    Elements are ordered.

    Can contain duplicates.

    Common = LinkedList & PriorityQueue.

    FIRST in FIRST out algorithm.

    The FIRST element of a Queue is known as "head".

    The LAST element of a Queue is known as "tail".
     */

    public static void main(String[] args) {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); // [apple, lemon, banana, orange, lemon]

        fruit.remove();
        System.out.println(fruit); //[lemon, banana, orange, lemon]

        //Find out the next item to be processed. Use "peek".
        System.out.println(fruit.peek()); //lemon
    }
}
