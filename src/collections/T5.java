package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class T5 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet<>();

        set.add("C");
        set.add("A");
        set.add("B");

        System.out.println(set); //[C, A, B]
    }
}
