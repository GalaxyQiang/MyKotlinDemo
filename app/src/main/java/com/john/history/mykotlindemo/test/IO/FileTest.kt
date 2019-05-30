package com.john.history.mykotlindemo.test.IO

import java.io.File

fun main() {
    val file=File("D:/AAA/BBB/CCC/DDD")
    println("name:"+file.name)
    println("path:"+file.path)
    println("absolutePath:"+file.absolutePath)
    println("parent:"+file.parent)
    println("is file:" +file.isFile)
    println("is directory:" +file.isDirectory)
    println("is exist:" +file.exists())
    println("length:" +file.length())
    println("makedirs:" +file.mkdirs())


}