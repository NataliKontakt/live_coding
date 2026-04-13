package strings;

import java.util.HashMap;
import java.util.Map;

/*
* Посчитать количество вхождений каждого символа
* "java" -> j-1, a-2, v-1
* "12g" -> 1-1, 2-1, g-1
* ":#$@##" -> :-1, #-3, $-1, @-1
*
* Алгоритм
* 1. Идти по каждому символу строки
* 2. Если для символа еще нет ключ-значения, то создаю со значением символ - 1
* 3. Если для символа есть ключ-значение, то обновляю символ: то, что было + 1
 * */
public class RepeatNumberTask {
    public static Map<Character, Integer> repeatNumberOfChars(String input) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : input.toCharArray()){
            if(!freq.containsKey(c)){
                freq.put(c,1);
            } else {
                Integer feqForC = freq.get(c); //достаем значение
                freq.put(c, feqForC + 1);
            }
            //freq.put(c, freq.getOrDefault(c,0) +1); //идентично предыдущему условию

        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.println(repeatNumberOfChars("java"));
        System.out.println(repeatNumberOfChars("12g"));
        System.out.println(repeatNumberOfChars(":#$@##"));
    }

}
