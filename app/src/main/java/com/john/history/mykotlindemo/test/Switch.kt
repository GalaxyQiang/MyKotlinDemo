package com.john.history.mykotlindemo.test

fun main() {
    fun2()
}
//T.also和T.let在使用时，作用域内不允许对it赋值，否则会出现“val cannot be reassigned”错误提示
private fun fun2() {
    var a = 1
    var b = 2

    a = b.let {
        b = a
        it
    }
    println(a)
    println(b)
}

private fun fun1() {
    var a = 1
    var b = 2

    a = b.also { b = a }
    println(a)
    println(b)
}