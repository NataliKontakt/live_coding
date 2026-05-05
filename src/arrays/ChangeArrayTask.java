package arrays;

import java.util.*;
import java.util.stream.IntStream;

public class ChangeArrayTask {
    /*
    1. Удалить дубликаты (сохранив порядок)
    [2,2,1,3,1,4] -> [2,1,3,4]

    Алгоритм
    1. Добавить все значения в сет (использовать LinkedHahSet)
    2. Пройтись по Set и добавить все в массив

    * */

    public static int[] removeDublicates (int[] arr){
        Set<Integer> seen = new LinkedHashSet<>();
        for(int num : arr){
            seen.add(num); //Добавили все значения все (без дубликатов)
        }
        int[] result = new int[seen.size()];
        int i = 0;
        for (int num : seen){
            result[i] = num;
            i++;
        }
        return result;
    }

    public static int[] removeDublicatesAsvanced (int[] arr){
        return Arrays.stream(arr)
                .distinct()
                .toArray();
    }

    public static void printArray (int[] arr){
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }


    /*
    * Развернуть массив
    * [2, 1, 3, 4] -> [4, 3, 1, 2]
    *
    * Алгоритм
    * Вариант 1. Пойти с конца 1 массива и положить все в новый массив
    * Сложность: 1 обход массива, память - новый массив такой же длины
    * Вариант 2. Пойти сначала и обменивать зеркальные элементы
    * Сложность: 1 обход массива, память - все в одном массиве
    * */

    public static void reverse (int[] arr){
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static int[] reverseAdvanced(int[] arr){
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - i - 1])
                .toArray();
    }

    /*
    3. Удалить все вхождения определенного числа
    [3,1,5,6,2,3,1,6,5] target=3 -> [1,5,6,2,1,6,5]
    Алгоритм
    1. Идти по всему массиву и удалять значения
    2. Операция удаления в массиве очень дорогая, т.к. сдвиг происходит в памяти
    3. Будем использовать список
    * */
    public static int[] removeAll(int[] arr, int target){
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num != target) result.add(num);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] removeAllAdvanced(int[] arr, int target){
        return Arrays.stream(arr)
                .filter(n -> n!=target).toArray();
    }

    public static void main(String[] args) {
        printArray(removeDublicatesAsvanced(new int[]{2,2,1,3,1,4}));
        int[] array = new int[]{2, 1, 3, 4};
        reverse(array);
        printArray(array);
        printArray(reverseAdvanced(new int[]{2, 1, 3, 4}));
        printArray(removeAll(new int[]{3,1,5,6,2,3,1,6,5}, 3));
        printArray(removeAllAdvanced(new int[]{3,1,5,6,2,3,1,6,5}, 3));
    }
}
