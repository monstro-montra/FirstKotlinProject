fun getName(): String { //functions can also be inferenced
    return "Melina"
}

fun getGreeting(): String = "Hello, "

fun sayName(): Unit { //type unit is basically absence of any 'useful' type. returns nothing useful.
    //one does not actually need to have the word "Unit" as it is redundant. You can omit it just like in main.
    println(getName())
}

fun greet(greeting:String, name:String) = println("$greeting $name!") //single expression function


fun main(){
    println(getGreeting())
    sayName()

    greet("Hello", "Melina")

}