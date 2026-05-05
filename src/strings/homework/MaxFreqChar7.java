package strings.homework;

import java.util.HashMap;
import java.util.Map;

/*
*Условие:
Верни символ, который встречается в строке чаще всего. Если таких несколько — верни любой из них.
Пример:
"abcCCCcddee" → 'c'
*
* Вход - строка, выход символ
*
* Алгоритм
* 1. Избавляемся от пробелов, понижаем регистр
* 2. Создаем массив 256 символов
* 3. Первый проход цикла - записываем символы соответствующую ячейку и значение в ячейке увеличиваем на 1
* 4. Второй проход циклом - вычитываем числа из ячеек и ищем максимальное
* 5. возвращаем символ, соответствующий ячейке
* */
public class MaxFreqChar7 {
public static char maxFreqChar (String input){
    String cleaned = input.replaceAll("//s+", "").toLowerCase();
    int[] freq = new int[256];
    for (int i=0; i< cleaned.length(); i++){
        char  c = cleaned.charAt(i);
        freq[c]++;
    }
    char mostFreq = cleaned.charAt(0);
    int maxCount = freq[mostFreq];

    for (char c : cleaned.toCharArray()) {
        if (freq[c] > maxCount) {
            maxCount = freq[c];
            mostFreq = c;
        }

    }
    return mostFreq;
    }

    public static char mostFrequentChar(String input) {
        // Проверка на null и пустую строку
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть null или пустой");
        }

        String cleaned = input.replaceAll("//s+", "").toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : cleaned.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) +1);
            } else {
                map.put(c, 1);
            }
        }

        char maxFreq = cleaned.charAt(0);
        int maxCount = 0;

        for (char c : map.keySet()){
            if(maxCount < map.get(c)){
                maxCount = map.get(c);
                maxFreq = c;
            }
        }
        return maxFreq;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("abcCCCcddee"));
    }
}
