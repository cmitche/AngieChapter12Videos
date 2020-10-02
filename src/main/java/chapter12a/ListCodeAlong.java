package chapter12a;

import java.util.ArrayList;
import java.util.List;

public class ListCodeAlong {
    public static void main(String[] args) {
//      Lists: ArrayList, LinkedList, Stacked & More.
//      Lists are ordered
//      Lists index start at index 0;
//      Lists can contain duplicate elements

        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }
}
