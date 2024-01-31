//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
//        1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
package org.example.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    checkArray(new Integer[]{1,2,null,4,56});
    }
    public static void checkArray(Integer[] arr){
        List<Integer> errIndexs= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null) errIndexs.add(i);
        }
        if(errIndexs.size()!=0) throw new RuntimeException(String.format("null встретился в индексах: %s", errIndexs));
        System.out.println("В массиве нет null");
    }
}
