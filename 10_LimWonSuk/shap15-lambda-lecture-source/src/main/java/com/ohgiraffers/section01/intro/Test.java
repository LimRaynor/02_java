package com.ohgiraffers.section01.intro;

public class Test {
    public static void main(String[] args) {
        Test t1 = new Test();

        Calculator c = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;

                Test t1 = (a, b) -> a + b;
                System.out.println(t1);
            }
        };
    }
}
