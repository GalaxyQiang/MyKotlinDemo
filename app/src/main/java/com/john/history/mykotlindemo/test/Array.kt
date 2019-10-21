package com.john.history.mykotlindemo.test

import java.util.ArrayList

fun main() {
    val c:Int
    val a= mutableListOf<Int>(1,2,3)
    a[0]=10
    for (i:Int in a){
        println(i)
    }
    val b=ArrayList<Int>()
    b.add(1)
    b.add(2)
    b.add(3)
    b[0]=100
    b.forEach { println(it) }
//    for (i:Int in b){
//        println(i)
//    }
}