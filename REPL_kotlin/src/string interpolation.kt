//fun main(args:Array<String>){
//
//    val name = " darshana"
//    val str = "hello $name"
//
//    println("the statement is $str. the number of characters in statement is ${str.length}")
//
//}

//fun main(args:Array<String>){
//
//    val a = 10
//    val b = 5
//
//    println("the sum of $a and $b is ${a+b}")
//
//}

fun main(args:Array<String>){

    var rect = Rectangle()
    rect.length = 10
    rect.breadth = 5

    println("The length of rectanglr is ${rect.length} and breadth is ${rect.breadth}. The area is ${rect.length * rect.breadth}")

}

class  Rectangle{

    var length:Int = 0
    var breadth:Int = 0

}