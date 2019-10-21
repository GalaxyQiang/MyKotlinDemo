package com.john.history.mykotlindemo.test

import androidx.appcompat.app.AlertDialog
import java.util.*


fun main(){
    listshow()

}
class User(var name:String,var age:Int,var sex:String,var score:Int){

}
private  fun  datacopy(){
    val user =User("john",27,"male",76)
    mutableListOf<String>("john","james","polo")
}

private fun listshow() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
//    numbers.let { println(it) }
    numbers.map { it.length }.filter { it > 4 }.let { print(it) }
}