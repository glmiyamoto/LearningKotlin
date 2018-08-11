package com.glmiyamoto.learningkotlin.java;

public class ControlFlow {
    // IF
    private int operatorIf(final int value) {
        final int i;
        if (value > 0) {
            i = 1;
        } else if (value < 0) {
            i = -1;
        } else {
            i = 0;
        }

        return i;
    }

    private int operatorIfTernary(final int value) {
        return value > 0 ? 5 : -5;
    }

    // FOR
    private void operatorFor() {
        final int[] a = new int[] { 0, 1, 2, 3, 4 };
        for (int i : a) {
            int value = i;
        }

        for (int i = 0; i < 10; i++) {
            int value = i;
        }

        for (int i = 0; i < 10; i += 2) {
            int value = i;
        }

        for (int i = 9; i >= 0; i--) {
            int value = i;
        }
    }

    // SWITCH
    private String operatorSwitch() {
        final int a = 0;
        final String b;
        switch (a) {
            case 0:
                b = "0";
                break;
            case 1:
                b = "1";
                break;
            case 2:
                b = "2";
                break;
            default:
                b = "?";
                break;
        }

        return b;
    }
}
