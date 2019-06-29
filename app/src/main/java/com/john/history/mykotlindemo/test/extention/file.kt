package com.john.history.mykotlindemo.test.extention

fun main() {
    var aaa=AAA(100);
    aaa.apply {
        age=200
    }.also {
        println(it.age)
    }

}

class AAA(var age: Int){

}