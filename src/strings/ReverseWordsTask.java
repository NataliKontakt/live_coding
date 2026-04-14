package strings;

/*
* "I love    Java" -> "Java love I" /может быть несколько пробелов, но он считается как один
* "I am QA" -> "QA am I"
*
* Алгоритм
* 1. Разделяю предложения на слова с помощью пробелов
* 2. Выстраиваю новое предложение, начиная со списка слов с конца, разделяя пробелом
* 3. Формирую финальную стоку
* */
public class ReverseWordsTask {
    public static String reverseWords(String input){
        //trim() удаляет пробелы в начале и в конце, split() разделяет слово по указанному разделителю
        //replaceAll("\\s+", " ") - все, что больше чем 2 пробела "\\s+" заменить на один пробел
        String[] words = input.trim().replaceAll("\\s+", " ").split(" ");
        if (words.length > 5){
            throw new IllegalArgumentException("Более 5 слов недопустимо!");
        }
        StringBuilder stringBuilder = new StringBuilder(); // добавление в однопоточной системе делаем с помощью стрингбилдера
        for(int i = words.length - 1; i >= 0; i--){
            stringBuilder.append(words[i]); //append() - добавить в конец
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
/*
* Тестирование
* - Минимальное количество слов - 1
* - Максимальное количество слов - 5 // гран значения 4, 5, 6
* */
    public static void main(String[] args) {
        System.out.println(reverseWords("I love    Java"));
        System.out.println(reverseWords("I am QA"));
        System.out.println(reverseWords("I am QA альфа бета гамма"));
    }
}
