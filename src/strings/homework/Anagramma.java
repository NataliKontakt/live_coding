package strings.homework;

import java.util.Arrays;

/*
* "listen" и "silent" → true
* "hello" и "world" → false
*
* Алгоритм
* 1. На вход 2 стринга, на выход boolean
* 2. Прохожу циклом по первому и проверяю содержит ли второе буквы из первого
* если нет возвращаю false
* если да
* 3. Прохожу циклом по второму и проверяю содержит ли первое буквы из второго
* если нет возвращаю false
* если да - возвращаю true
 * */
public class Anagramma {
    public static boolean isAnagramm(String input1, String input2){
       String clean1 = input1.replaceAll(" ", "").toLowerCase();
       String clean2 = input2.replaceAll(" ", "").toLowerCase();

       if (clean1.length() != clean2.length()){
           return false;
       }

       char[] chars1 = clean1.toCharArray();
       char[] chars2 = clean2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagramm("listen", "silent"));
        System.out.println(isAnagramm("hello", "world"));
    }
}
