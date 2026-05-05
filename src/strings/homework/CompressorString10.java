package strings.homework;
/*
*Условие:
Сожми строку, заменив группы одинаковых символов подряд на один символ + количество.
Пример:
"aabcccccaaa" → "a2b1c5a3"
Если сжатая строка не короче — верни оригинал.
*
* Вход строка, выход строка
*
* 1. считаем группы одинаковых символов
* 2. Добавляем в результат символ + количество
* 3. Сравниваем исходную и полученную строку, выводим полученную, если она короче
* */
public class CompressorString10 {
public static String compressorString( String input){
    StringBuilder result = new StringBuilder();
    int count = 1;

    for (int i = 1; i < input.length(); i++){
        if(input.charAt(i) == input.charAt(i-1)){
            count++;
        } else {
            result.append(input.charAt(i-1)).append(count);
            count = 1;
        }
    }
    result.append(input.charAt(input.length()-1)).append(count);

    if (result.length() < input.length()){
        return result.toString();
    } else {
        return input;
    }
}

    public static void main(String[] args) {
        System.out.println(compressorString("aabcccccaaa"));
    }
}
