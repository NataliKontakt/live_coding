package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class BasicOperationTask {
    /*
    1) Найти максимум (минимум) в массиве
    * */

    public static int max (int[] arr){
        if (arr.length == 0) {return -1;}
         int max = arr[0]; //по умолчанию, максимум - первое число
        for (int num : arr){
            if (max < num){
                max = num;
            }
        }
        return max;
    }

    public static OptionalInt maxAdvanced(int[] arr){
        return Arrays.stream(arr).max();
    }

    /*
    2) Найти второй максимум
    * */
    public static int secondMax(int[] arr){
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > max){
                max = num;
                secondMax = max;
            } else if (num < max && num > secondMax){
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static OptionalInt secondMaxAdvanced(int[] arr){
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .findFirst();
    }

    public static void main(String[] args) {
        int[] array = {1,2,10,2};
        System.out.println(maxAdvanced(array).orElse(-1));
        System.out.println(secondMaxAdvanced(array).orElse(-1));
    }

}
