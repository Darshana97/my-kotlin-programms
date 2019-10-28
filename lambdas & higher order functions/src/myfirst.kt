fun main(args:Array<String>){

    val programme = Programme()
    programme.addTwoNumbers(1,5)    //simple way..for better understanding
    programme.addTwoNumbers(1,5, object :MyInterface{
        override fun execute(sum: Int) {
            println(sum)    //body
        }

    })

    val test:String = "Hello"

    val myLambda:(Int) -> Unit  = { s:Int -> println(s) }     //lambda expression[functio]
    programme.addTwoNumbers(1,5, myLambda)

}

class Programme{

    fun addTwoNumbers(a:Int, b:Int, action: (Int) -> Unit){    //high level function with lambda as parameter

        val sum = a+b
        action(sum)     //println(sum)
        println(sum)       //body

    }

    fun addTwoNumbers(a:Int, b:Int, action: MyInterface){       //using interface/ object oriented way

        val sum = a+b
        action.execute(sum)


    }

    fun addTwoNumbers(a:Int, b:Int){    //simple way..just for better understanding

        val sum = a+b
        println(sum)

    }

}

interface MyInterface{

    fun execute(sum:Int)

}

