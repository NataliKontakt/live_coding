package strings;

/*
*  Палиндром - это строка, которая читается с обеих сторон одинаково
* "abba" -> true
* "abc" -> false
* Поддерживаются ли пробелы? Да
* "dd dd" -> true
* Могут ли быть большие буквы? Да
* "Dd dd" -> true
*
* Алгоритм
* 1. Удаляю побелы, привожу к нижнему регистру
* 2. Читаю с одной стороны, запоминаю
* 3. Читаю с другой стороны, запоминаю
* 4. Если строки равны, то палиндром, если нет - то нет
* */
public class PalindromeTask {
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll(" ","").toLowerCase(); //все пробелы заменяю на пустую строку, привожу к нижнему регистру
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString()); //делаю стрингбилдер из cleaned, переворачиваю, привожу к строке
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("dd dd"));
        System.out.println(isPalindrome("Dd dd"));

    }
}
