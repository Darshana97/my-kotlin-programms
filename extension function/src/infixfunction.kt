fun main(args:Array<String>){

    val x:Int = 6
    val y:Int = 10

    val greaterVal = x greaterValue 15
    println(greaterVal)

}


infix fun Int.greaterValue(other: Int):Int{  //infix function and also extension func

    if(this > other)
        return this
    else
        return other
}