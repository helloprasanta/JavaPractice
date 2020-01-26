package com.array;

public class ArrayAddition {
    static int[] array = {10, 20, 30, 40, 50, 10};

    static int sum() {
        int sum = 0;
        int i;
        for (i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of given array is " + sum());
    }


}
