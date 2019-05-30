package com.john.history.mykotlindemo.test.IO

import java.io.File
import java.io.FilenameFilter

fun main() {
    val file=File("D:\\Program Files\\Google\\Cloud Picture")
    val filelist=file.list(FileFilter("png"))
    for ( filename in filelist){
        println(filename)
    }
}

class FileFilter(var extent: String):FilenameFilter{
    override fun accept(dir: File?, name: String?): Boolean {

        return name?.endsWith("."+extent)!!
    }

}