// fun main(args:Array<String>){
//
//     val  a = 5
//     val b = 10
//
//     var maxValue: Int
//
//     if (a > b)
//         maxValue = a
//
//     else
//         maxValue = b
//
//     println("the max value is $maxValue")
// }


fun main(args:Array<String>){

    val  a = 5
    val b = 10

    var maxValue: Int = if (a > b){
                                a
                            }
                        
                        else{
                            b
                        }



    println("the max value is $maxValue")
}