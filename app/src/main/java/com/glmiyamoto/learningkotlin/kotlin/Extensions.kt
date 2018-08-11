package com.glmiyamoto.learningkotlin.kotlin

// Extension Functions
fun Variable.doSomeThing(value: Int): Int {
    return this.x + this.y + value
}

// Nullable Receiver
fun String?.sha256(): String {
    if (this == null) return ""

    return this + "Aplicando HASH"
}

// Extension Properties
val <T> List<T>.lastIndex: Int
    get() = size - 1

// Infix
infix fun Int.miyamoto(value: Int): Int {
    return this + value - value
}