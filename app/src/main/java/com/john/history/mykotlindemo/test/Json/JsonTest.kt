package com.john.history.mykotlindemo.test.Json

import androidx.lifecycle.MediatorLiveData
import com.google.gson.Gson
import java.io.*

fun main() {
    val file=File("D:/json2.txt")
    var student=Student("john","male",31 )
//    var mediatorLiveData=MediatorLiveData<Double>()
   var string=Gson().toJson(student)
    println(string)
//    var fos=FileOutputStream(file).write(string.toByteArray())
    var fos=BufferedWriter(OutputStreamWriter(FileOutputStream(file)))
    fos.write(string)
    fos.close() //不写这段代码，保存的文件内容是空的
}

class Student( var name:String,  var sex:String,  var age:Int):Teacher(name,sex,age){

}

open class Teacher( var name1:String, var sex1:String, var age1:Int=50){}