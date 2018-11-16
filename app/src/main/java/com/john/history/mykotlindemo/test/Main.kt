package com.john.history.mykotlindemo.test

fun main(args: Array<String>) {
    val xiaoming=Student("high school","小明",16)
    val xiaohong=Student("college","小红",20)
    println(xiaoming.name+", "+xiaoming.age+", "+xiaoming.category)
    println(xiaohong.name+", "+xiaohong.age+", "+xiaohong.category)
    xiaoming.sex="male"
    xiaohong.sex="female"
    println(xiaoming.name+", "+xiaoming.age+", "+xiaoming.category)
    println(xiaohong.name+", "+xiaohong.age+", "+xiaohong.category+", "+xiaohong.sex)
}

open class People( name:String,var age:Int){
  var name:String
    get() = field
    init {
        this.name=name

    }
}

class Student(var category:String,name: String,age: Int):People(name,age){

}