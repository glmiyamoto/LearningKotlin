package com.glmiyamoto.learningkotlin.kotlin

class Operator {
    private fun math(a: Int, b: Int) {
        var c = 0
        c = a + b
        c = a.plus(b)

        var d = 0
        d = a - b
        d = a.minus(b)
    }

    private fun increment(a: Int) {
        a.inc()
        a.dec()
    }

    private fun operators(a: Int, b: Int) {
        if (a > b) return
        if (a >= b) return
        if (a < b) return
        if (a <= b) return
        if (a == b) return
        if (a != b) return

        val c = a or b
        val d = a and b
        val e = a xor b
    }
}