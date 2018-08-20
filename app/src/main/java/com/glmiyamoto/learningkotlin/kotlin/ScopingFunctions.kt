package com.glmiyamoto.learningkotlin.kotlin

import android.content.Intent
import android.net.Uri
import java.io.File

class ScopingFunctions {

//        val str: String = "..."
//
//        val result = str.xxx {
//            print(this) // Receiver
//            print(it) // Argument
//            42 // Block return value
//        }
//
//    ╔══════════╦═════════════════╦═══════════════╦═══════════════╗
//    ║ Function ║ Receiver (this) ║ Argument (it) ║    Result     ║
//    ╠══════════╬═════════════════╬═══════════════╬═══════════════╣
//    ║ let      ║ this@MyClass    ║ String("...") ║ Int(42)       ║
//    ║ run      ║ String("...")   ║ N\A           ║ Int(42)       ║
//    ║ run*     ║ this@MyClass    ║ N\A           ║ Int(42)       ║
//    ║ with*    ║ String("...")   ║ N\A           ║ Int(42)       ║
//    ║ apply    ║ String("...")   ║ N\A           ║ String("...") ║
//    ║ also     ║ this@MyClass    ║ String("...") ║ String("...") ║
//    ╚══════════╩═════════════════╩═══════════════╩═══════════════╝
//    * those functions are not extension methods, they need to be called the old-fashioned way

    val test = Test(0, null)

    fun test1() {
        // 1. Normal vs. extension function
        with(test) {
            value = "Test $id"
        }

        test.run {
            value = "Test: $id"
        }
    }

    fun test2() {
        // 2. This vs. it argument
        test.run {
            value = "Test: $id"
        }

        test.let {
            it.value = "Test ${it.id}"
        }
    }

    fun test3() {
        // 3. Return this vs. other type
        val stringVariable : String? = "abc"

        stringVariable?.let {
            println("The length of this String is ${it.length}")
        }

        // Exactly the same as below

        stringVariable?.also {
            println("The length of this String is ${it.length}")
        }

        // --------------------------------------------
        val original = "abc"

        // Evolve the value and send to the next chain
        original.let {
            println("The original String is $it") // "abc"
            it.reversed() // evolve it as parameter to send to next let
        }.let {
            println("The reverse String is $it") // "cba"
            it.length  // can be evolve to other type
        }.let {
            println("The length of the String is $it") // 3
        }

        // Wrong
        // Same value is sent in the chain (printed answer is wrong)
        original.also {
            println("The original String is $it") // "abc"
            it.reversed() // even if we evolve it, it is useless
        }.also {
            println("The reverse String is ${it}") // "abc"
            it.length  // even if we evolve it, it is useless
        }.also {
            println("The length of the String is ${it}") // "abc"
        }

        // Corrected for also (i.e. manipulate as original string
        // Same value is sent in the chain
        original.also {
            println("The original String is $it") // "abc"
        }.also {
            println("The reverse String is ${it.reversed()}") // "cba"
        }.also {
            println("The length of the String is ${it.length}") // 3
        }
    }

    // :::: SOME APPROACH ::::

    // 1.
    // Normal approach
    fun makeDir(path: String): File {
        val result = File(path)
        result.mkdirs()
        return result
    }

    // Improved approach
    fun makeDir2(path: String) = path.let{ File(it) }.also{ it.mkdirs() }

    // 2.
    fun createIntent(intentData: String, intentAction: String) {
        var intent = Intent()
        intent.action = intentAction
        intent.data = Uri.parse(intentData)

        // Improved approach, chaining
        intent = Intent().apply {
            action = intentAction
            data = Uri.parse(intentData)
        }
    }

    class Test(var id: Int, var value: String?)
}