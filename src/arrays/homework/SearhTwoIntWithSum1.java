package arrays.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
*Найти два числа с заданной суммой
Условие:
Дан массив int[] nums и число target. Нужно найти индексы двух чисел, сумма которых равна target.
Если таких нет — вернуть null или [-1, -1].
Пример:
nums = [2, 7, 11, 15], target = 9 → результат: [0, 1]

* Вход, массив чисел и число, выход массив чисел
*
* Алгоритм
*1. Создаем мап где ключ - значение элемента массива, а значение - его индекс
* проходим циклом и ищем элемент который будет дополнять текущий ключ до target, например, если ключ 7 до 9 нужно 2.
* если текущий элемент, не тот, который нам нужен, добавляем в мап
* если тот, выводим массив, где индексы двух найденных элементов
* */
public class SearhTwoIntWithSum1 {
    public static int[] twoSum (int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length - 1; i++){
            int result = target - nums[i];
            if (map.containsKey(result)){
                return new int[]{map.get(result), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }


}
