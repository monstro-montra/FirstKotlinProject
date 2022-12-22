//top level variables
//type declaration not necessary due to type inference in kotlin
var name: String? = null //if you want as a legit value, you need the question mark after the type declaration. nullable string.
var greeting = "Hello" //mutable

fun main() {
    val name2 = "Alex" //val cannot be reassigned, but var can.

    println(greeting + " " + name)
    greeting = "Hi"
    println(greeting + " " + name2)

    if(name != null){
        println("Name is not null!")
    } else {
        println("Name is null")
    }
    //when statement is similar to switch
    when(greeting){ //when greeting is
        null -> println("Hi") //case for when it is null
        else -> greeting = "hola!" //otherwise case
    }

    //name = "Melina"
    //val nameToPrint = if(name != null) name else "John" //if it is not null, give it the name, otherwise, nameToPrint is "John"
    //one can also get the same desired effect from above with a when statement
    val nameToPrint = when (name) { // set nameToPrint to (case) when name is
        null -> "John" //case for when name is null
        else -> name // 'otherwise' case
    }
    println(greeting)
    println(nameToPrint)
}