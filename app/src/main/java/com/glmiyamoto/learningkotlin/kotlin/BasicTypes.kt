package com.glmiyamoto.learningkotlin.kotlin

class BasicTypes {
    // Numbers
    private fun numbers() {
        var num: Int = 123
        var numLong = 123L
        var hexa = 0x0F
        var binary = 0b00001011
        var numDouble = 100.0
        var numFloat = 100f

        // Using underscores to make number constants more readable
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010
    }

    // Conversions
    private fun conversions() {
        // Byte to int
        val b: Byte = 1
        val i: Int = b.toInt()
        val s: Short = b.toShort()
    }

    // Operations
    private fun operations() {
        val b1 = 1 shl 2
        val b2 = 1 shr 2
        val b3 = 1 ushr 2
        val b4 = 1 and 2
        val b5 = 1 or 2
        val b6 = 1.inv()
    }

    // Floating Point Numbers Comparison
    private fun floatingPointNumbersComparison(a: Int, b: Int) {
        val b1 = a == b
        val b2 = a != b
        val b3 = a < b
        val b4 = a > b
        val b5 = a >= b
        val b6 = a <= b
        val b7 = a in 1..5
        val b8 = a !in 1..5
    }

    // Arrays
    private fun arrays() {
        val i = intArrayOf(0, 1, 2, 3, 4)
        val c = doubleArrayOf()

        val asc = Array(5, { i -> (i * i).toString() }) // ["0", "1", "4", "9", "16"]
    }

    // Strings
    private fun strings() {
        val s = "test"
        for (c in s) {
            c
        }

        val text = """
            for (c in "foo")
                print(c)
        """.trimMargin()
    }

    // String Templates
    private fun stringTemplates() {
        val i = 10
        val s = "i = $i" // "i = 10"
    }
}