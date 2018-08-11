package com.glmiyamoto.learningkotlin.kotlin

// Não tem como criar uma nova instância
abstract class AbstractClass {
    internal abstract fun getZero(): Int
}

class SubClass : AbstractClass() {
    override fun getZero(): Int {
        return 0
    }
}

open class OpenClass {
    fun getZero(): Int {
        return 0
    }
}

class OutClass {
    var a = 100

    class NestedClass {
        fun test(): Int {
            return 100
        }
    }

    inner class InnerClass {
        var a = 10

        fun test(): Int {
//            return a
            return this@OutClass.a
        }
    }
}