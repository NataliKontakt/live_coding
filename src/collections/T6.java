package collections;

import java.util.*;

public class T6 {
    public static void main(String[] args) {
        Set set = new TreeSet<>();

        set.add(5);
        set.add(1);
        set.add(3);

        System.out.println(set); //[1, 3, 5]
    }
}
