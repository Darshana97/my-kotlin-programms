//fun main(args:Array<String>){
//
//    val program = Program()
//
//    val myLambda: (Int, Int) -> Int = {x:Int, y:Int -> x+y}     //lambda expression[function]
//    program.addTwoNumbers(2,7, myLambda)
//    program.addTwoNumbers(2,7, {x:Int, y:Int -> x+y})
//    program.addTwoNumbers(2,7) {x:Int, y:Int -> x+y}
//
//
//}
//
//class Program{
//
//    fun addTwoNumbers(a:Int, b:Int, action: (Int, Int) -> Int){     //high level function with lambda
//
//        val result = action(a,b)        //x+y = a+b = 2+7 = 9
//        println(result)
//    }
//}

//________________________________________________________________________________

fun main(args:Array<String>){

    val program = Program()
    var result = 0

//    val myLambda: (Int, Int) -> Int = {x:Int, y:Int -> x+y}     //lambda expression[function]
//    program.addTwoNumbers(2,7, myLambda)      //or
//    program.addTwoNumbers(2,7, {x:Int, y:Int -> x+y})         //or
   // program.addTwoNumbers(2,7) {x:Int, y:Int -> x+y}

    program.addTwoNumbers(2,7) {x, y -> result = x+y }       //or

    println(result)

}

class Program{

    fun addTwoNumbers(a:Int, b:Int, action: (Int, Int) -> Unit){     //high level function with lambda

        action(a,b)        //x+y = a+b = 2+7 = 9

    }
}



















