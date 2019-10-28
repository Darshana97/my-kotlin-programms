fun main(args:Array<String>){

    var person = Person()

    with(person){
        person.name = "Achi"
        person.age = 23
    }


    person.apply {
        person.name = "Achi"
        person.age = 23
    }.startRun()


    println(person.name)
    println(person.age)


}

class Person{

    var name:String = ""
    var age:Int = -1

    fun startRun(){
        println("Now I am ready to run")
    }

}