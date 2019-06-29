package com.john.history.mykotlindemo.test.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.nio.channels.AsynchronousByteChannel
import kotlin.concurrent.thread

fun main() {
//    GlobalScope.async {
//        val list=(1..5).map {async { 10*it } }
//    }

    repeat(10){
        println(it)
    }
}

private fun launchX() {
    //代码运行在main线程中
    println("Thread")
    println("线程ID:${Thread.currentThread().id}")
    println("线程name:${Thread.currentThread().name}")
    GlobalScope.launch {
        //代码运行在DefaultDispatcher-worker-1线程中
        println("线程ID:${Thread.currentThread().id}")
        println("线程name:${Thread.currentThread().name}")
        delay(1000)
        println("corotines")
        println("线程ID:${Thread.currentThread().id}")
        println("线程name:${Thread.currentThread().name}")
    }

    Thread.sleep(3000)
    println("Thread")
    println("线程ID:${Thread.currentThread().id}")
    println("线程name:${Thread.currentThread().name}")
}

private fun xunhuan() {
    val list = (1..5 step 2).map {
        println(it * 2)
        2 * it
    }

    val list2 = (5 downTo 1).map {
        println(it * 2)
        2 * it
    }
}