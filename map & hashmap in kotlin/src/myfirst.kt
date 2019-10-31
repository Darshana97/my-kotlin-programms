//fun main(args:Array<String>){
//
//    //map tutorial : key-value pair
//
//    var myMap = mapOf<Int,String>(4 to "Achi", 43 to "Darshana", 7 to "Senevirathna")  //immutable, fixed size,read only
//
//    for (key in myMap.keys){
//        //using individual element (objects)
//        println("Element at key: $key = ${myMap[key]}")     //myMap.get(key)
//    }
//
//}


//__________________________________________________________________________

fun main(args:Array<String>){

    //map tutorial : key-value pair

    var myMap = HashMap<Int,String>()  //mutable ,read and write both, no fixed size
//    var myMap = mutableMapOf<>()<Int,String>()      //linkedhashmap
//    var myMap = hashMapOf<>()<Int,String>()


    myMap.put(4,"Achi")
    myMap.put(43,"Darshana") 
    myMap.put(7,"Senevirathna")

    myMap.replace(43,"Brayan")
    myMap.put(4,"Pubudu")

    for (key in myMap.keys){
        //using individual element (objects)
        println("Element at key: $key = ${myMap[key]}")     //myMap.get(key)
    }

}