package com.glmiyamoto.learningkotlin.java;

public class BasicTypes {
    // Numbers
    private void numbers() {
        int num = 123;
        long numLong = 123L;
        int hexa = 0x0F;
        int binary = 0b00001011;
        double numDouble = 100.0;
        float numFloat = 100f;
    }








    // Conversions
    private void conversions() {
        // Byte to int
        final byte b = 1;
        final int i = b;
        final short s = b;
    }

    // Operations
    private void operations() {
        final int b1 = 1 << 2;
        final int b2 = 1 >> 2;
        final int b3 = 1 >>> 2;
        final int b4 = 1 & 2;
        final int b5 = 1 | 2;
        final int b6 = ~1;
    }

    // Floating Point Numbers Comparison
    private void floatingPointNumbersComparison(int a, int b) {
        final boolean b1 = a == b;
        final boolean b2 = a != b;
        final boolean b3 = a < b;
        final boolean b4 = a > b;
        final boolean b5 = a >= b;
        final boolean b6 = a <= b;
        final boolean b7 = a >= 1 && a <= 5;
        final boolean b8 = !(a >= 1 && a <= 5);
    }

    // Arrays
    private void arrays() {
        final int[] i = new int[] { 0, 1, 2, 3, 4 };

        final String[] asc = new String[5];
        for (int n = 0; n < asc.length; n++) {
            asc[n] = String.valueOf(n * n);
        }
    }

    // Strings
    private void strings() {
        final String s = "test";
        for (int i = 0; i < s.length(); i++) {
            s.charAt(i);
        }

        final String text = "\n" +
        "for (c in \"foo\")\n" +
        "print(c)\n" +
        "\n";
    }

    // String Templates
    private void stringTemplates() {
        final int i = 10;
        final String s = "i = " + 10; // "i = 10"
    }
}
