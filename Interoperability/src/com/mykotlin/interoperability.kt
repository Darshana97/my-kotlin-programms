@file:JvmName("MyCustomKotlinFileName")

package com.mykotlin

import com.myjava.MyJavaFile


fun main(args:Array<String>){

    var area = MyJavaFile.getArea(10,5)
    println("Printing area from kotlin file: " + area)

}

fun add(a: Int, b: Int):Int {

    return a + b

}