package collections;

import java.util.LinkedList;
import java.util.Queue;

public class T3 {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C"); // [A, B, C]

        System.out.println(queue.poll()); // Извлекает заголовок с удалением, возвращает заголовок -> A
        System.out.println(queue.peek()); // Извлекает заголовок без удаления, возвращает заголовок -> B
        System.out.println(queue); // [B, C]
    }
}
