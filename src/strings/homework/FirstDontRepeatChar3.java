package strings.homework;

import java.util.HashMap;
import java.util.Map;

/*
* Условие:
* Найди первый символ, который встречается только один раз в строке.
* Верни индекс. Если такого нет — верни -1.
Пример:
"leetcode" → 0 ('l')
"aabb" → -1
*
* Алгоритм
* На вход строка, на выход целое число
* 1. Создаем массив для символов размером 256
* 2. первый проход циклом - преобразование строки в char
* и увеличение значения в ячейке конкретного символа на 1
* 3. второй проход циклом - ищем первую встречающуюся 1
* 4. Если находим - выводим индекс, если нет -1
* */
public class FirstDontRepeatChar3 {
    public static int firstUniqueChar(String input){
        int[] freq = new int[256];
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            freq[c]++;
        }

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (freq[c] == 1){
                return i;
            }
        }


        return -1;
    }

    public static int firstUniqueCharForMap(String input){
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }

        for (int i =0; i< input.length(); i++){
            if(map.get(input.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

/*
*   public static int firstUniqCharHashMap(String s) {
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();

        // Подсчет частоты
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Поиск первого уникального
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
    */


    public static void main(String[] args) {
        System.out.println(firstUniqueCharForMap("leetcode"));
        System.out.println(firstUniqueCharForMap("aabb"));
        System.out.println(firstUniqueCharForMap("aafbb"));
    }

}
