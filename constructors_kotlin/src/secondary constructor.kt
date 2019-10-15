fun main(args:Array<String>){

    var student = Student("Darshana",10)

    println(student.id)

}

class Student(var name: String){         //primary constructor

    var id: Int = -1

    init {
        println("Student has got a name as $name and id is $id")
    }

    constructor(n:String, _id:Int):this(n){
        //the body of the secondary constructor is called after the init block
        this.id = _id

    }

}