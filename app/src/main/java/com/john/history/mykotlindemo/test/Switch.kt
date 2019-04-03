package com.john.history.mykotlindemo.test

fun main() {
    var a=1
    var b=2

   a=b.also { b=a+it }
    println(a)
    println(b)
}