package com.john.history.mykotlindemo.test

fun main() {
    fooo()
}

fun fooo(){
    listOf(1,2,3,4).forEach {
        if (it==3) return@forEach
        print(it)
    }
}