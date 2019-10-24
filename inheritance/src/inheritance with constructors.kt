//primary constructor with inheritance
//fun main(args:Array<String>){
//
//    var dog = Dog("black","pug")
//}
//
//open class Animal(var color:String){
//
//    init {
//        println("From Animal Init: $color")
//    }
//}
//
//class Dog(color: String, var breed:String):Animal(color){
//
//    init {
//        println("From dog init: $color and $breed")
//    }
//}

//secondary constructor with inheritance
fun main(args:Array<String>){

    var dog = Dog("black","pug")
}

open class Animal{

        var color:String = ""

        constructor(color:String){
            this.color = color
            println("From Animal Init: $color")
        }

}

class Dog:Animal{

    var breed:String = ""

    constructor(color: String,breed:String):super(color){
        this.breed = breed
        println("From dog init: $color and $breed")
    }

}