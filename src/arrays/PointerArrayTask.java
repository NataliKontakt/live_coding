package arrays;

public class PointerArrayTask {
    /*
    * Слияние двух отсортированных массивов
    * [1,4,6,9], [2,4,11] -> [1,2,4,4,6,9,11]
    *
    * Алгоритм: (версия1)
    * слить два массива за счет конкатенации
    * отсортировать по возрастанию получившийся массив
    * Сложность: новая память длина м+к, сортировка: худший случай (М+К)^2, оптимальный log(М+К)*(М+К)
    *
    * Алгоритм: (версия1)
    * 1. Два указателя, каждый указывает на текущий рассматриваемый элемент в массиве
    [1,4,6,9]
     0,1,2,3
    [2,4,11]
     0,1,2
    * Итерация1
    * pointer1 = 0
    * pointer2 = 0
    * resultArray = [_,_,_,_,_,_,_] (m+k = 4 + 3 = 7]
    *
    * Итерация2
    * pointer1 = 1
    * pointer2 = 0
    * resultArray = [1,_,_,_,_,_,_] (m+k = 4 + 3 = 7]
    *
    * Итерация3
    * pointer1 = 1
    * pointer2 = 1
    * resultArray = [1,2,_,_,_,_,_] (m+k = 4 + 3 = 7]
    *
    * Итерация4
    * pointer1 = 2
    * pointer2 = 1
    * resultArray = [1,2,4,_,_,_,_] (m+k = 4 + 3 = 7]
    *
    * Итерация5
    * pointer1 = 2
    * pointer2 = 2
    * resultArray = [1,2,4,4,_,_,_] (m+k = 4 + 3 = 7]
    *
    * Итерация6
    * pointer1 = 3
    * pointer2 = 2
    * resultArray = [1,2,4,4,6,_,_] (m+k = 4 + 3 = 7]
    *
    * Итерация7
    * pointer1 = 4
    * pointer2 = 2
    * resultArray = [1,2,4,4,6,9,_] (m+k = 4 + 3 = 7]
    *
    * Итерация8
    * pointer1 = 4
    * pointer2 = 3
    * resultArray = [1,2,4,4,6,9,11] (m+k = 4 + 3 = 7]
    *
    * Конец цикла
    *
    * 2. Из двух указателей массива, выбираем тот который указывает на меньший элемент.
    * 3. Этот элемент (наименьший) добавляем в новый массив, а соответствующий указатель двигаем.
    * 4. Если мы обошли полностью один из исходных массивов, то добавляем в новый массив остаток от того, что еще не закончился
    * */

    public static int[] merge (int[] arr1, int[] arr2){
        int m = arr1.length, k = arr2.length;
        int[] resultArray = new int[m + k];

        int pointer1 = 0, pointer2 = 0, resultArraypointer = 0;
        while (pointer1 < m && pointer2 < k){
            if(arr1[pointer1] < arr2[pointer2]){
                resultArray[resultArraypointer] = arr1[pointer1];
                pointer1++;
                resultArraypointer++;
            } else {
                resultArray[resultArraypointer] = arr2[pointer2];
                pointer2++;
                resultArraypointer++;
            }

            while (pointer1 < m){
                resultArray[resultArraypointer] = arr1[pointer1];
                pointer1++;
                resultArraypointer++;
            }

            while (pointer2 < k){
                resultArray[resultArraypointer] = arr2[pointer2];
                pointer2++;
                resultArraypointer++;
            }
        }
        return resultArray;
    }
/*
* Найти максимальную сумму подмассива длиной k
* [3,5,10,2], k = 2 -> Все подмассивы: [3,5], [5,10], [10,2] 3 подмассива
* [3,5,10,2], k = 3 -> Все подмассивы: [3,5,10], [5,10,2] 2 подмассива
 * Подмассив (упорядоченный массив длиной k, внутри основного массива)
 *
 * Алгоритм подсчета суммы
 * Сумма первого подмассива = x
 * Тогда сумма второго подмассива = x - первый элемент + новый элемент с конца
 * Сумма первого подмассива = arr[0] ... + arr[k-1] = x
 * Тогда сумма второго подмассива = x - arr[0] + arr[k]
 *
 * Алгоритм
 * Два указателя:
 * [3,5,10,2], k = 2
 *
 * Итерация 1
 * pointerBeg = 0
 * pointerEnd = k-1 = 1
 * Посчитали сумму, обновили максимум sum = 3+5=8, max = 8
 *
 * Итерация 2
 * pointerBeg = 1
 * pointerEnd = 2
 * Посчитали сумму с учетом предыдущей sum = 8 - 3 + 10 = 15, обновили максимум, если нужно max = 15;
 *
 * Итерация 3
 * pointerBeg = 2
 * pointerEnd = 3
 * Посчитали сумму с учетом предыдущей sum = 15 - 5 + 2 = 12, обновили максимум, если нужно max = 15 (не обновляем)
 *
 * Ответ: max = 15;
 *
* */

    public static int windowSum(int[] arr, int k){
        int pointerBeg = 0, pointerEnd = k - 1;
        int max = 0;
        int currSum = 0;
        for(int i = pointerBeg; i <= pointerEnd; i++){
            currSum += arr[i];
        }

        max = currSum;

        while (pointerEnd + 1 < arr.length){
            currSum = currSum - arr[pointerBeg] + arr[pointerEnd + 1];
            if (currSum > max){
                max = currSum;
            }
            pointerBeg++;
            pointerEnd++;
        }
        return max;
    }
    public static void printArray (int[] arr){
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
/*        printArray(merge(new int[]{1,4,6,9}, new int[]{2,4,11}));
        printArray(merge(new int[]{1,1,1}, new int[]{2,2,2}));
        printArray(merge(new int[]{1,4,6,9}, new int[]{2,4,9,11}));
        printArray(merge(new int[]{1,4,6}, new int[]{2,4,9,11}));
        printArray(merge(new int[]{4}, new int[]{2,9}));*/
        System.out.println(windowSum(new int[]{3,5,10,2}, 2));
    }
}
