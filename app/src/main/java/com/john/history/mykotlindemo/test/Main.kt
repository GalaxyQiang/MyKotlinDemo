package com.john.history.mykotlindemo.test

import android.arch.lifecycle.MutableLiveData

fun main(args: Array<String>) {
    val xiaoming=Student("high school","小明",16)
    val xiaohong=Student("college","小红",20)
//    println(xiaoming.name+", "+xiaoming.age+", "+xiaoming.category)
//    println(xiaohong.name+", "+xiaohong.age+", "+xiaohong.category)
//    xiaoming.sex="male"
//    xiaohong.sex="female"
//    println(xiaoming.name+", "+xiaoming.age+", "+xiaoming.category)
//    println(xiaohong.name+", "+xiaohong.age+", "+xiaohong.category+", "+xiaohong.sex)
    val data=MutableLiveData<String>()
    data.value="kotlin demo"
    println(xiaoming.sex)

}

open class People( name:String,var age:Int){
  var name:String="People init执行之前的name=$name".also { println(it) }
    get() = field
    init {
        this.name=name
        println(name)

    }
}

class Student(var category:String,name: String,age: Int):People(name,age){

}