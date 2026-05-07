package collections;

import java.util.*;

public class T9 {
    public static void main(String[] args) {
        Map map = new TreeMap<>();

        map.put("b", 2);
        map.put("a", 1);
        map.put("c", 3);

        System.out.println(map); //{a=1, b=2, c=3}
    }
}
