package com.john.history.mykotlindemo.test

class Deee (){
    var i=1;
    fun foo(num:Int){
        var j:Int     //局部变量可以不用初始化，声明一下就可以
        j=num+5
        println(j)
    }
}

fun main() {
    val k=Deee()
    k.foo(100)
}