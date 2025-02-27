package com.kihongkim.level01.normal;

public class Application2 {

    public static <T extends Number> double sum(T[] array) {

        if (array == null) {
            throw new IllegalArgumentException("배열은 null일 수 없습니다.");
        }

        double sum = 0.0;
        for (T number : array) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
    }
}
