package com.glmiyamoto.learningkotlin.java;

public class Operator {
    private void math(final int a, final int b) {
        int c = 0;
        c = a + b;


        int d = 0;
        d = a - b;
    }

    private void increment(int a) {
        a++;
        a--;
    }

    private void operators(final int a, final int b) {
        if (a > b) return;
        if (a >= b) return;
        if (a < b) return;
        if (a <= b) return;
        if (a == b) return;
        if (a != b) return;

        final int c = a | b;
        final int d = a & b;
        final int e = a ^ b;
    }
}
