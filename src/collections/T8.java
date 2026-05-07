package collections;

import java.util.*;

public class T8 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap<>();

        map.put("B", 2);
        map.put("A", 1);
        map.put("C", 3);

        System.out.println(map.keySet()); //[B, A, C]
    }
}
