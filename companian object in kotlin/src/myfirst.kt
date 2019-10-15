fun main(args:Array<String>){

    MyClass.count
    MyClass.typeOfCustomers()

}

class MyClass{

    companion object {

        var count: Int = -1     //behave like static variable

        fun typeOfCustomers(): String{      //behave like static methods
            return "Sri lankan"
        }

    }
}