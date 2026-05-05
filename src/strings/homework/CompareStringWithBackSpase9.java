package strings.homework;
/*
* Условие:
Сравни две строки с символами '#', которые означают "удалить предыдущий символ". Верни, одинаковы ли строки после обработки.
Пример:
"ab#c" и "ad#c" → true
"a#c" и "b" → false
*
* В цикле будем проверять если символ == # и длина строки > 0, удаляем последний символ
* иначе добавляем символ в стрингбилдер
* и сравниваем две строки
* */
public class CompareStringWithBackSpase9 {

    public  static boolean compareString (String input1, String input2){
        return removeChar(input1).equals(removeChar(input2));
    }

    private static String removeChar (String input){
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()){
            if (c == '#'){
                if (result.length() > 0){
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compareString("#ab##c", "ad##c"));
        System.out.println(compareString("a#c", "b"));
    }
}
