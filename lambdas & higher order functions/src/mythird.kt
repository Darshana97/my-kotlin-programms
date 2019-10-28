fun main(args:Array<String>){

    val programs = Programs()
    programs.reverseAndDisplay("hello", { s-> s.reversed() })
    programs.reverseAndDisplay("hello", { it.reversed() })

}

class Programs{

    fun reverseAndDisplay(str:String, myFunc: (String) -> String){

        var result = myFunc(str)        //it.reversed() ===> str.reversed() ===> "hello".reversed() = "olleh"
        println(result)

    }

}