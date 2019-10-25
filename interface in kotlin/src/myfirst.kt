//fun main(args:Array<String>){
//
//    var myBtn = MyButton()
//    myBtn.onTouch()
//    myBtn.onClick()
//
//}
//
//interface MyInterfaceListner {       //interface is not a class
//
//    var name:String     //properties in interface are abstract by default
//
//    fun onTouch()      //methods in interface are abstract by default
//
//    fun onClick(){      //normal methods are public and open by default not final
//        println("onClick interface code: Button Clicked")
//    }
//
//
//}
//
//class MyButton : MyInterfaceListner {
//
//    override var name: String = "dummy_name"
//
//    override fun onTouch() {
//        //define your own code
//
//        println("Button was touched")
//    }
//
//    override fun onClick() {        //optional to override
//        super.onClick()
//        println("Button was clicked")
//    }
//
//}


//________________________________________________________________

fun main(args:Array<String>){

    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()

}

interface MyInterfaceListner {       //interface is not a class


    fun onTouch()      //methods in interface are abstract by default

    fun onClick(){      //normal methods are public and open by default not final
        println("MyInterfaceListner: onClick")
    }


}

interface MySecondInterface {       //interface is not a class


    fun onTouch(){
        println("MySecondInterface: onTouch ")
    }

    fun onClick(){      //normal methods are public and open by default not final
        println("MySecondInterface: onClick")
    }


}


class MyButton : MyInterfaceListner, MySecondInterface {
    override fun onClick() {
        super<MyInterfaceListner>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onTouch() {
        super.onTouch()
    }

}