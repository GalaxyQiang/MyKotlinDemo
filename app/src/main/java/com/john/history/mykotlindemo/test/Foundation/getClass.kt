package com.john.history.mykotlindemo.test.Foundation

open class A(){

}

class B:A(){

}

fun main() {
    var b= B()
    var a=A()
    println(a.javaClass)
    println(b.javaClass)
    println(b is A)
}