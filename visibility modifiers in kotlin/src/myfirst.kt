class TestClass{

    fun testing(){

        var person = Person()
        println(person.a)   //can't beacuse it's a private
        println(person.b)   //can't because only visible in sub class
        println(person.c)   //can because same module
        println(person.d)   //can
    }

}

open class Person{      //super class

    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4      //public by default
}

class SriLankan: Person(){      //derived class or subclass

    //a is not visible
    //b,c,d are visible

    fun test(){
        println(a)   //can't acces
        println(b)   //can access
        println(c)   //can access
        println(d)   //can access
    }
}