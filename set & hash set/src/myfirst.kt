//fun main(args:Array<String>){
//
//    //set contains unique elements
//    //"hashset" also contanis unique elements but sequence is not guranteed in output
//
//    var mySet = setOf<Int>(2,54,3,1,0,9,9,9,8)      //immutable.read only
//
//    for (element in mySet){
//
//        //using individual element(objects)
//        println(element)
//    }
//
//
//}


//________________________________________________________________

fun main(args:Array<String>){

    //set contains unique elements
    //"hashset" also contanis unique elements but sequence is not guranteed in output

    //var mySet = mutableSetOf<Int>(2,54,3,1,0,9,9,9,8)      //mutable set.read and write both
    var mySet = hashSetOf<Int>(2,21,3,1,0,6,9,9,8)
//    mySet.remove(54)
//    mySet.add(100)


    for (element in mySet){

        //using individual element(objects)
        println(element)
    }


}