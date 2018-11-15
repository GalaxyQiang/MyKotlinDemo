package com.john.history.mykotlindemo.test

fun main(args: Array<String>) {

}

open class People(var name:String,var age:Int){

}

class Student(var category:String,name: String,age: Int):People(name,age){

}