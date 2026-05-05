package strings.homework;

/*
* Условие:
Разверни порядок слов в строке. Слова разделяются одним или несколькими пробелами. Удали лишние пробелы.
Пример:
" the sky is blue " → "blue is sky the"
*
* Вход строка, выход строка
*
* Алгоритм
* 1. Удалить лишние пробелы
* 2. сделать массив слов, разделить по пробелу
* 3. Собрать в обратном порядке с добавлением пробела
* */
public class ReversrWord5 {
    public static String reverseWord (String input){
        if(input == null){
            throw new IllegalArgumentException("Строка не может быть null!");
        }
        String[] cleaned = input.trim().replaceAll("\\s+", " ").split(" ");
        if(cleaned.length < 2){
            throw new IllegalArgumentException("Длина строки должна быть не менее 2 слов!");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = cleaned.length -1; i >= 0; i--){
            stringBuilder.append(cleaned[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord(" the sky is blue "));
        //System.out.println(reverseWord(""));
       //System.out.println(reverseWord(" "));
        //System.out.println(reverseWord(" word"));
        //System.out.println(reverseWord(null));
    }
}
