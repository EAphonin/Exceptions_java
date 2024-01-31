//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3

package org.example.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(findIndexElem(new int[]{1,2,4,5,5},7,10));
    }

    public static int findIndexElem(int[] arr, int elem, int minVolume) {
        if (arr == null) {
            System.out.println("Аргумент не может быть null");
            return -3;
        }
        if (arr.length < minVolume) {
            System.out.println("Длина массива не может быть больше заданного");
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==elem) return i;
        }
        {
            System.out.println("Не найден элемент");
            return -2;
        }

    }
}
