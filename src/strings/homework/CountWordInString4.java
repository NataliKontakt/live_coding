package strings.homework;
/*
* Условие:
Дана строка. Подсчитай количество слов (определяй слова по пробелам, игнорируй множественные пробелы подряд).
Пример:
" Hello world " → 2
*
* Вход строка, выход число
*
* Алгоритм
* 1. Убрать множественные пробелы
* 2. Поместить слова в массив, разделяя по пробелам
* 3. Вывести длину массива
* */
public class CountWordInString4 {
   public static int countWord(String input){
       String[] clean = input.trim().replaceAll("\\s+", " ").split(" ");
       return clean.length;
   }

    public static void main(String[] args) {
        System.out.println(countWord(" Hello world "));
        System.out.println(countWord(" Hello              world "));
    }

}
