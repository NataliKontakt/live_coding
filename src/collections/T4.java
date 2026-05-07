package collections;

import java.util.HashSet;
import java.util.Set;

public class T4 {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add("C");
        set.add("A");
        set.add("B");

        System.out.println(set); //[C, A, B] - в рандомном порядке
    }
}
