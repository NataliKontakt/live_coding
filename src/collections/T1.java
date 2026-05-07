package collections;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2); //[1,2,3,2]

        list.remove(2); //удаляем число с индексом 2, остается [1,2,2]

        System.out.println(list);
    }
}
