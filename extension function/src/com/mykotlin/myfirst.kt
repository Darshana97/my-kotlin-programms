package com.mykotlin

//fun com.mykotlin.main(args:Array<String>){
//
//    var student = Student()
//    println("Pass status: " + student.hasPassed(97))
//    println("Schloarship status: " + student.isScholar(96))
//
//}
//
//fun Student.isScholar(marks: Int):Boolean{
//    return marks > 95
//}
//
//class Student{
//
//    fun hasPassed(marks:Int):Boolean{
//
//        return  marks > 40
//    }
//}


//fun com.mykotlin.main(args:Array<String>){
//
//    val str1:String = "Hello "
//    val str2:String = "World "
//    var str3:String = "Hey "
//
//    println(str3.add(str1, str2))
//
//}
//
//fun String.add(s1:String, s2:String):String{
//
//    return this + s1 + s2
//}


fun main(args:Array<String>){

    val str1:String = "Hello "
    val str2:String = "World "
    var str3:String = "Hey "

    println(str3.add(str1, str2))

    val x:Int = 6
    val y:Int = 10

    val greaterVal = x.greaterValue(15)
    println(greaterVal)

}

fun String.add(s1:String, s2:String):String{

    return this + s1 + s2
}

fun Int.greaterValue(other:Int):Int{

    if(this > other)
        return this
    else
        return other
}