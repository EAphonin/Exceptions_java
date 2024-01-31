//Реализуйте метод, принимающий в качестве аргументов целочисленный массив
//        и некоторый допустимый минимум.
//        Если длина массива меньше некоторого заданного минимума,
//        метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
package org.example.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkArraylenght(new int[]{1,3,4,55,6,7}, 10));
    }

    public static int checkArraylenght(int [] arr, int minVolue){
    if(arr.length<minVolue) return -1;
    return arr.length;
    }

}
