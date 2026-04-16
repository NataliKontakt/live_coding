package strings.homework;

import java.util.Arrays;

/*
* "listen" и "silent" → true
* "hello" и "world" → false
*
* Вход 2 строки, выход boolean
* Алгоритм
* 1. Сравниваю длину, если разная - false
* 2. Перевожу в массивы char
* 3. Сортирую
* 4. Сравниваю, если значения равны - анаграмма, если нет - нет
* */
public class Ana {
    public static boolean isAnagramm(String input1, String input2){
        String clean1 = clean(input1);
        String clean2 = clean(input2);

        if (clean1.length() != clean2.length()){
            return false;
        }

        char[] sort1 = sort(clean1);
        char[] sort2 = sort(clean2);

        return Arrays.equals(sort1, sort2);
    }

    private static String clean(String input){
        return input.replaceAll(" ", "");
    }

    private static char[] sort(String input){
        char[] cleaned = input.toCharArray();
        Arrays.sort(cleaned);
        return cleaned;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramm("listen", "silent"));
        System.out.println(isAnagramm("hello", "world"));
    }

}
