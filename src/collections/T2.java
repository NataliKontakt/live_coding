package collections;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30); // -> [10, 20, 30]

        list.remove(Integer.valueOf(20)); // удаляем значение 20 -> [10, 30]
        list.remove(0); // удаляем значение с индексом 0 -> [30]

        System.out.println(list);
    }
}
