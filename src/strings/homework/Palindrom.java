package strings.homework;
/*
* Проверить на палиндром
* "A man, a plan, a canal: Panama" → true
* "race a car" → false
*
* Алгоритм
* 1. Вход - строка, выход - boolean
* 2. Оставляю только буквы, понижаю регистр
* 3. Читаю с одной стороны, запоминаю
* 4. Читаю с другой стороны, запоминаю
* 5. Сравниваю значения строк: если совпадает - палиндром, если нет - нет
*
* */
public class Palindrom {
    public static boolean isPalindrom (String input){
        String cleaned = input
                .replaceAll("[^\\p{L}]", "")
                .toLowerCase();
        String reverse = new StringBuilder(cleaned)
                .reverse()
                .toString();
        return cleaned.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrom("race a car"));
    }
}
