package com.john.history.mykotlindemo.test.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            kotlinx.coroutines.delay(1000)
            println("1")
        }
        launch {
            kotlinx.coroutines.delay(2000)
            println("2")
        }
        launch {
            kotlinx.coroutines.delay(3000)
            println("3")
        }
        println("BEGIN")

    }

    println("END")
}

private fun sum() {
    var a = 0;
    var b = 0;
    var c = 0

    runBlocking {
        launch {
            delay(1000)
            a = 1
        }
        launch {
            delay(2000)
            b = 2
        }
        launch {
            delay(3000)
            c = a + b
            println("1000ms:  " + c)
        }
    }
    println("END:  " + c)
}