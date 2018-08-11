package com.glmiyamoto.learningkotlin.kotlin

class ControlFlow {
    // IF
    private fun operatorIf(value: Int): Int {
        val i: Int = if (value > 0) {
            1
        } else if (value < 0) {
            -1
        } else {
            0
        }

        return i
    }


    private fun operatorIfTernary(value: Int?): Int {
        return value ?: 100
//        return if (value > 0) 5 else -5
    }

    // FOR
    private fun operatorFor() {
        val a = intArrayOf(0, 1, 2, 3, 4)
        for (i in a) {
            val value = i
        }

        for (i in 0..9) {
            val value = i
        }

        for (i in 0 until 10) {
            val value = i
        }

        for (i in 0 until 10 step 2) {
            val value = i
        }

        for (i in 9 downTo 0) {
            val value = i
        }
    }

    // SWITCH (WHEN)
    private fun operatorSwitch(): String {
        val a = 0
        val b: String = when (a) {
            0 -> "0"
            1 -> "1"
            in 2..5 -> "2 a 5"
            else -> "?"
        }

        return b
    }

    // Break and Continue Labels
    private fun breakAndContinueLabels() {
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i in 25..75) break@loop
            }
        }

        listOf(1, 2, 3, 4, 5).forEach lit@ {
            if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        }
    }
}