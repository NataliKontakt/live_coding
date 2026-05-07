package collections;

import java.util.*;

public class T7 {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("A", 3);

        System.out.println(map); //{A=3, B=2}
    }
}
