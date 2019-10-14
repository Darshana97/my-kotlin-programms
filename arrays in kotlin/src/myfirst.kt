//fun main(args:Array<String>){
//
//    var myArray = Array<Int>(5){ 0 }        //mutable.fixed size
//    myArray[0] = 32
//    myArray[3] = 54
//
//
//    for (element in myArray){       //using individual element(objects )
//        println(element)
//    }
//
//    println()
//
//
//    for (index in 0..myArray.size -1){
//        println(myArray[index])
//    }
//
//}

//__________________________________________________________________________

//fun main(args:Array<String>){
//
//    var list = listOf<String>("achi","darshana","pubudu")       //immutable, fixed size, read only
//
//
//    for (element in list){      //using individual element (objects)
//        println(element)
//    }
//
//    println()
//
//    for (index in 0..list.size -1){
//        println(list[index])
//    }
//
//}


//_____________________________________________________________________________

fun main(args:Array<String>){

//    var list = mutableListOf<String>()       //mutable, no fixed size, can add or remove elements
//    var list = arrayListOf<String>()      //mutable, no fixed size, can add or remove elements
    var list = ArrayList<String>()       //mutable, no fixed size, can add or remove elements

    list.add("Achi")
    list.add("Darshana")
    list.add("Senevirathna")

    list.remove("Achi")
    list.add(0,"Brayan")

    list[1] = "Bandara"

    for (element in list){      //using individual element (objects)
        println(element)
    }

    println()

    for (index in 0..list.size -1){     //using index of the element(objects)
        println(list[index])            //list.get(index)
    }

}

