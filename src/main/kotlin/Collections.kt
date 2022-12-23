fun sayHello(greeting:String, vararg toBeGreeted:String){ //vararg will be treated as an array. variable arguments
    toBeGreeted.forEach{item ->
        println("$greeting $item")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "default") = println("$greeting $name") // you can have defaults for an argument.

fun main(){
    val things = arrayOf("Alex", "Melina", "John", "Tyler", "Sarah", "Martin")
    println("Size of array: " + things.size)
    println(things[0]) //get index 0 of things
    val things2 = listOf("Coffee, Soda, Water, Orange Juice")//list in kotlin. immutable by default.
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")// map in kotlin

    sayHello("Hello", *things) //things alone will throw a mismatch. it needs to be an array of string. * is the spread operator.
    greetPerson(name = "Nate")
    greetPerson()
    sayHello(greeting = "Hi", toBeGreeted = *things)
}
