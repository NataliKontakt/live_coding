package strings.homework;

import java.util.HashMap;
import java.util.Map;

/*
* Условие:
Проверь, можно ли переставить символы строки так, чтобы получился палиндром.
Пример:
"civic" → true
"ivicc" → true
"hello" → false
*
* Может быть палиндромом если:
* количество символов четное и каждый символ встречается четное количество раз
* количество символов нечетное и каждый символ встречается нечетное количество раз
*
* Вход - строка, выход - boolean
*
* Алгоритм
*
* Создаем map, записываем символ ключом и добавляем 1, каждый раз, когда он встречается
* считаем количество нечетных вхождений символов, если меньше или равно 1 - true
* иначе - false
* */
public class CanBePalindrom8 {
    static boolean canBePalindrom (String input){
        String cleaned = input.replaceAll("//s+", "").toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : cleaned.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int oddCount = 0;
        for( int count : map.values()){
            if (count % 2 == 1){
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canBePalindrom("civic"));
        System.out.println(canBePalindrom("ivicc"));
        System.out.println(canBePalindrom("hello"));

    }
}
