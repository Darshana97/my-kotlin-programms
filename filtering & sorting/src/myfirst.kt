//fun main(args:Array<String>){
//
//    val myNumbers: List<Int> = listOf(2,3,4,6,23,90)
//
////  val mySmallNums = myNumbers.filter { v -> v < 10 }
//    val mySmallNums = myNumbers.filter { it < 10 }
//
//    for (num in mySmallNums){
//        println(num)
//    }
//
//    println()
//
//    val mySquaredNums = myNumbers.map { it * it }       //or{ num -> num * num }
//    for (num in mySquaredNums){
//        println(num)
//    }
//
//    println()
//    val mySmallSquaredNums = myNumbers.filter { it < 10 }.map { it * it }
//
//    for (num in mySmallSquaredNums){
//        println(num)
//    }
//
//}


//_______________________________________________________________________

fun main(args:Array<String>){

    val myNumbers: List<Int> = listOf(2,3,4,6,23,90)

//  val mySmallNums = myNumbers.filter { v -> v < 10 }
    val mySmallNums = myNumbers.filter { it < 10 }

    for (num in mySmallNums){
        println(num)
    }

    println()

    val mySquaredNums = myNumbers.map { it * it }       //or{ num -> num * num }
    for (num in mySquaredNums){
        println(num)
    }

    println()
    val mySmallSquaredNums = myNumbers.filter { it < 10 }.map { it * it }

    for (num in mySmallSquaredNums){
        println(num)
    }

    println()

    var people = listOf<Person>(Person(10,"Brayan"), Person(23,"Pubudu"),Person(17,"Bandara"))
//    var names = people.map { it.name }
    var names = people.filter { it.name.startsWith("B") }.map { it.name }

    for (name in names){
        println(name)
    }

}

class Person(var age:Int, var name: String){
    //some other code
}