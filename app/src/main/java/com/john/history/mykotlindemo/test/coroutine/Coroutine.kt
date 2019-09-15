package com.john.history.mykotlindemo.test.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(){
    println("Thread is :"+Thread.currentThread().name)
    val thread= newSingleThreadContext("aaa")
    //runBlocking会阻塞当前的主线程，它创建的协程运行在aaa线程上
    runBlocking(thread) {
        println("Thread is :"+Thread.currentThread().name)
        launch {
            delay(1000)
            println("Task from runBlocking")
            println("Thread is :"+Thread.currentThread().name)
        }
        coroutineScope {
            launch {
                kotlinx.coroutines.delay(3000)
                println("Task from coroutineScope nested launch")

            }
            kotlinx.coroutines.delay(2000)
            println("Task from coroutineScope suspend")

        }

        delay(1000)
        println("runBlocking end")
    }

    println("Main Thread End")
}



fun foo(){
    (0..1000).map { GlobalScope.async{it} }
    measureTimeMillis {  }
    runBlocking {
        async {  }
    }
}