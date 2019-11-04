//fun main(args:Array<String>){
//
//    val myNumbers = listOf(2,3,4,6,23,90)
//
//    val check1 = myNumbers.all( { it > 10 } )      //are all elements  greater than 10 ?
//    println(check1)
//
//    val check2 = myNumbers.any({ it > 10 })     //does any of these elements satisfy the predicate
//    println(check2 )
//
//    val totalCount: Int = myNumbers.count{ it > 10 }       //number of elements that satisfy the predicate
//    println(totalCount)
//
//    val num = myNumbers.find { it > 10 }        //returns the first number that matches the predicate
//    println(num)
//
//}


//______________________________________________________________________

fun main(args:Array<String>){

    val myNumbers = listOf(2,3,4,6,23,90)

    val myPredicate = { num:Int -> num > 10 }

    val check1 = myNumbers.all(myPredicate)      //are all elements  greater than 10 ?
    println(check1)

    val check2 = myNumbers.any(myPredicate)     //does any of these elements satisfy the predicate
    println(check2 )

    val totalCount: Int = myNumbers.count(myPredicate)       //number of elements that satisfy the predicate
    println(totalCount)

    val num = myNumbers.find (myPredicate)       //returns the first number that matches the predicate
    println(num)

}