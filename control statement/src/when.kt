// fun main(args:Array<String>){
//
//     val x = 5
//
//     when (x){
//
//         1 -> println("x is 1")
//         2 -> println("x is 2")
//         else -> println("x value is unknown")
//     }
// }

//fun main(args:Array<String>){
//
//    val x = 10
//
//    when (x){
//
//        0,1 -> println("x is 0 OR 1")
//        2 -> println("x is 2")
//        else -> {
//            println("x value is unknown")
//            println("i don't know what is x")
//        }
//    }
//}

//fun main(args:Array<String>){
//
//    val x = 11
//
//    when (x){
//
//        in 1..20 -> println("x is in 1 to 20")
//        2 -> println("x is 2")
//        else -> {
//            println("x value is unknown")
//            println("i don't know what is x")
//        }
//    }
//}

//fun main(args:Array<String>){
//
//    val x = 5
//
//    var str: String
//
//    when (x){
//
//        1 -> str = "x is 1"
//        2 -> str = "x is 2"
//        else -> {
//            str = "x value is unknown"
//
//        }
//    }
//
//    println(str)
//}

fun main(args:Array<String>){

    val x = 5



    var str: String = when (x){

        1 ->  "x is 1"
        2 ->  "x is 2"
        else -> {
            "x value is unknownn"

        }
    }

    println(str)
}