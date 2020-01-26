package com.array;

public class ArraySubtraction {
    static int [] arr={60,10,20};

    static int sub(){
        int sub=0;
        int i;

        for (i=0;i<arr.length;i++)
            sub-=arr[i];

        return sub;
    }

    public static void main(String[] args) {
        System.out.println("After Array Subtraction "+sub());
    }


}
