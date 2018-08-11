package com.glmiyamoto.learningkotlin.kotlin

class Listener {
    fun test(listener: onListener) {
        listener.test(5)
    }

    fun usingTest() {
        test(object: onListener {
            override fun test(value: Int): Int {
                return value
            }
        })
    }

    interface onListener {
        fun test(value: Int): Int
    }
}

class Lambda {
    fun test(value: (Int) -> Unit, value2: (Int) -> Unit) {
        // Success
        value(5)
        // Error
        value2(4)
    }

    fun test(value: (Int, String) -> Unit) {
        value(5, "")
    }

    fun usingTest() {
        test({ i -> print(i) }, { n -> print(n)})
    }
}