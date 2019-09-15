package com.john.history.mykotlindemo.test.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    showThreadName()
    val th=GlobalScope.launch {
        showThreadName()
        repeat(10){
            delay(1000)
            launch {
                println(it)
            }
        }
    }
    Thread.sleep(15000)

}

fun showThreadName(){
    println("Thread is :"+Thread.currentThread().name+"  id: "+Thread.currentThread().id)
}