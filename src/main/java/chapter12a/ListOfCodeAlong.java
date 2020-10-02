package chapter12a;

import java.util.List;

public class ListOfCodeAlong {
    public static void main(String[] args) {
        List unchangeableList = List.of("apple", "lemon", "banana");
        unchangeableList.add("orange"); //UnsupportedOperationException
        unchangeableList.remove(1); //UnsupportedOperationException
    }
}
