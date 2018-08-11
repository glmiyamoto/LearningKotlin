package com.glmiyamoto.learningkotlin.kotlin

class Variable {
    // Imutable x Mutable
    val x = 0
    var y = 0

    // String
    val a = ""
    val a2: String = ""
    val a3: String? = null
    lateinit var a4: String
    internal val a5 = "Test: $a / $a2" // visible inside the same module

    // Int
    val b = 1
    val b1 = 0b00011110
    val b2 = 0b00_01_11_10
}

class Variableeee {
    val x = Variable().a5
    val y = Variable().doSomeThing(10)
    val hash = "Test".sha256()
    val test = 5 miyamoto 10

    fun aaa() {
        val arr = intArrayOf(0, 1, 2, 3, 4)
        arr.filter { it % 2 == 0 }
        arr.map { it.toByte() }
    }
}