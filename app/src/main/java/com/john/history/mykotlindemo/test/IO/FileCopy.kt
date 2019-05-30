package com.john.history.mykotlindemo.test.IO

import java.io.FileInputStream
import java.io.FileOutputStream

fun main() {
    val bis=FileInputStream("D:/AAA/pic.jpg")
    val bos=FileOutputStream("D:/copy.jpg")
    var byte= ByteArray(1024)

    var len=bis.read(byte)
    while (len!=-1){
        bos.write(byte,0,len)
        len=bis.read(byte)
    }
}