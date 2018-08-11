package com.glmiyamoto.learningkotlin.kotlin

class PropertiesAndFields {
    val a = 1
    var b = 2
    lateinit var c: Any

    var someThing: Int = a
        private set

    val someThing2: Int
        get() = b

    val someThing3: Int
        get() {
            b = a
            return b
        }
}