//fun main(args:Array<String>){
//
//    CustomersData.count = 98
//    CustomersData.typeOfCustomers()
//
//    println(CustomersData.count)
//
//    CustomersData.count = 109
//    println(CustomersData.count)
//
//}
//
//object CustomersData{
//
//    var count: Int = -1     //behave like static variable
//
//    fun typeOfCustomers(): String{
//        return "Sri Lankan"
//    }
//
//
//}

fun main(args:Array<String>){

    CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.count)

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("Hello")

}

open class MySuperClass{

    open fun myMethod(str: String){
        println("MySuperClass")
    }

}

object CustomersData: MySuperClass(){

    var count: Int = -1     //behaves like static variable

    fun typeOfCustomers(): String{      //behaves like static methods
        return "Sri Lankan"
    }

    override fun myMethod(str: String) {        //currently, behaving like stataic method
        super.myMethod(str)
        println("object CustomersData: " + str)
    }


}