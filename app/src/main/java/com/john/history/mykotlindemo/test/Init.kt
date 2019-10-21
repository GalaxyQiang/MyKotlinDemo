package com.john.history.mykotlindemo.test

class Man(age:Int){
    init {
        println("init_1")
    }
    constructor(sex:String,age: Int):this(age){
        println("次构造函数")
    }
    init {
        println("init_2")
    }
}

fun main() {
    val polo=Man("男",18)
}