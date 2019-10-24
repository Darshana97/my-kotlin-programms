//
//
//fun main(args:Array<String>){
//
//    var dog = Dog()
//    dog.eat()
//    println(dog.color)
//
//    var cat = Cat()
//    cat.eat()
//    println(cat.color)
//
//
//}
//
//open class Animal{
//
//    open var color:String = "white"
//
//    open fun eat(){
//        println("Animal Eating")
//    }
//
//}
//
//class Dog: Animal() {
//
//    var breed:String = ""
//
//    fun bark(){
//        println("Bark")
//    }
//
//    override fun eat(){
//       // super<Animal>.eat()
//        println("Dog is eating")
//    }
//
//    override var color:String = "Brown"
//
//}
//
//class Cat: Animal() {
//
//    var age:Int = -1
//
//    fun meow(){
//        println("Meow")
//
//    }
//
//    override fun eat(){
//        println("Cat is eating")
//    }
//
//    override var color:String = "grey"
//
//}