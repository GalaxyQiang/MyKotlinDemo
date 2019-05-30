package com.john.history.mykotlindemo.test.IO

import java.io.File
import java.io.FileOutputStream

fun main() {
    getPath()
}

private fun stringoutput(){

}

private fun getPath(){
    println(System.getProperty("user.dir"))
}

private fun bytesoutput() {
    val file=File("D:/AAA/aaa.txt")
    var outstring = FileOutputStream(file)
    var string = "hello \r\n  world????".toByteArray()
    outstring.write(string)
    println("path"+file.path)
    println("parent"+file.parent)
}