//fun main(args:Array<String>){
//
//    val country = Country()
//
//    country.name = "Sri Lanka"
//    println(country.name)
//
//    country.setup()
//
//}
//
//class Country{
//
//    lateinit var name: String
//
//    fun setup(){
//
//        println("The name of country is $name")
//    }
//
//}

//_____________________________________________________________________________

fun main(args:Array<String>){

    val country = Country()
     country.setup()

}

class Country{

    lateinit var name: String

    fun setup(){
        name = "USA"
        println("The name of country is $name")
    }

}

//lateinit used only with mutble data type { var }
//lateinit used only with non-nullable data type
//lateinit values must be initialised before you use it

