package com.john.history.mykotlindemo.test

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    var num = 5
    var list = arrayOf(1, 3, 5, 7, 9.3)
    for (item in list.indices) {
        println(list[item])
    }
    list.reverse()
//    for (item in list){
//        println(item)
//    }

    list.forEach {
        println(it)
    }

    val map = mapOf<Int, String>(1 to "A", 2 to "B")
    map.forEach {
    k, v->println(k)
}
}