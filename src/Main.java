//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            String s = "sTriNg";
            String s1 =  "TriN";
            String equalsS = "sTrINg";
/*        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(1,5));
        System.out.println(s.equals(equalsS));*/
        System.out.println(s.equalsIgnoreCase(equalsS));
        System.out.println(s.contains(s1));


        /*
        не буквы:
        String regex = "[^\\p{L}]";
        где:
        1. Квадратные скобки [ ]
Определяют класс символов (набор символов)

2. Символ ^ внутри скобок
Означает отрицание = "все символы, кроме указанных"

3. \\p{L}
\\p - это Unicode категория (свойство символа)

{L} - категория Letter (буквы)


        * \\p{L}  - Любые буквы (Letters)
        * \\p{Lu} - Заглавные буквы (Uppercase)
        * \\p{Ll} - Строчные буквы (Lowercase)
        * \\p{N}  - Цифры (Numbers)
        * \\p{P}  - Пунктуация (Punctuation)
        * \\p{Z}  - Пробелы (Separators)
        * \\p{S}  - Символы (Symbols: $, +, =)
        * */
    }
}