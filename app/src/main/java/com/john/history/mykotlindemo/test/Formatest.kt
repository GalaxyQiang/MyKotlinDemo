package com.john.history.mykotlindemo.test

import kotlin.random.Random

fun main(){

    for (i in 1..10) {
        var ii= Random.nextInt(130)
        println(String.Companion.format("%.2f",ii/3.0))
//        println(String.Companion.format("%03d",ii))
    }
}