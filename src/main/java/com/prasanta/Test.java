package com.prasanta;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add_result = calculator.add(3, 5);
        System.out.println("After Add:"+add_result);

        int sub_result=calculator.sub(9,6);
        System.out.println("After Sub :"+sub_result);

        int mul_result=calculator.mul(4,5);
        System.out.println("After Mul:"+mul_result);

        float div_result=calculator.div(20,4);
        System.out.println("After Div:"+div_result);


    }
}
