fun sayHello(greeting:String, toBeGreeted:String) = println("$greeting $toBeGreeted") //single expression function

fun main(){
    val things = arrayOf("Alex", "Melina", "John", "Tyler", "Sarah", "Martin")
    println("Size of array" + things.size)
    println(things[0]) //get index 0 of things
    for(thing in things ){ //iterate over each value in things array
        sayHello("Hello,", thing)
    }
}