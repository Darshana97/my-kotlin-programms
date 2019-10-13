fun main(args:Array<String>){

}

abstract class Person{  //you cannot create instance of abstract class

    abstract var name: String   //can;t instantiate property in abstract

    abstract fun eat()          //abstract properties are "open" by default
    open fun getHeight(){}          //A "open" function ready to be overridden
    fun goToSchool(){}              //A normal function: public and final by default

}

class SriLankan: Person(){
    override var name: String = "dummy_srilankan_name"


    override fun eat() {

    }



}