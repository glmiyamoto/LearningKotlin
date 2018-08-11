package com.glmiyamoto.learningkotlin.java;

public class Listener {
    void test(onListener listener) {
        listener.test(5);
    }

    void usingTest() {
        test(i -> i);
    }

    interface onListener {
        int test(int value);
    }
}
