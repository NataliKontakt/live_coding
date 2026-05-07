package collections;

import java.util.*;

public class T10 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3); // [1, 2, 3]
        System.out.println(stack.pop()); //3
        System.out.println(stack); //[1, 2]
    }
}
