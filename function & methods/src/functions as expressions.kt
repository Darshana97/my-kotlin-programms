//fun main(args:Array<String>){
//
//    var maxValue = max(1,8)
//    println("maximum value is ${maxValue}")
//}
//
//fun max(a:Int, b:Int) = if(a > b){a} else {b}
//
//



fun main(args:Array<String>){

    var maxValue = max(1,8)
    println("maximum value is ${maxValue}")
}

fun max(a:Int, b:Int)
        = if(a > b){
                println("$a is greater")
                a

        } else {
            b
            println("$b is greater")
                  
        }


