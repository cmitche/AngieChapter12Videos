package chapter12a;

import java.util.HashSet;
import java.util.Set;

public class SetCodeAlong {
    public static void main(String[] args) {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        /*
        Duplicate items are not stored
        No errors will occur
         */

        System.out.println(fruit.size()); //4
        System.out.println(fruit); // [banana, orange, apple, lemon]
    }

}
