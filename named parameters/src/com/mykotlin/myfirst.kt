@file:JvmName("MyCustomKotlinFileName")

package com.mykotlin

fun main(args:Array<String>){

//    findVolume(2, 3,30)
        findVolume(length = 2, breadth = 3)


}

@JvmOverloads
fun findVolume(length:Int, breadth:Int, height:Int=10){

    println("Length is " + length)
    println("Breadth is " + breadth)
    println("Height is " + height)


}