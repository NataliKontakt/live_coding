package strings.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* Удали повторяющиеся символы в строке, оставив только первое вхождение каждого символа.
Пример:
"banana" → "ban"
*
* вход строка, выход строка
* Алгоритм
* 1. Очистим строку от пробелов
* 2. поместим символы в сет
* 3. выведем
* */
public class RemoveDublicate6 {
    public static String removeDublicateChar(String input){
        if(input == null || input.trim().isEmpty()){
            throw new IllegalArgumentException("Строка не может быть null или пустой!");
        }
        String cleaned = input.replaceAll("\\s+", "");
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c: cleaned.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDublicateChar("banana"));
        System.out.println(removeDublicateChar(" ban  ana"));
        System.out.println(removeDublicateChar(null));
    }
}
