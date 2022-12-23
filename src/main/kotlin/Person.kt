class Person(val firstName: String = "Default", val lastName: String = "Default") { //no curly braces needed. _ is necessary for parameters. But you could still pass in a value and set their default values.

    //compiler automatically sets getters and setters for class properties. var will have getters and setters. vals will only have getters.
    var nickName: String? = null
        set(value) { //override the set method for whenever nickname is called
            field = value //to actually assign a new value to the property,
            println("The new nickname is $value!")
        }
        get() { //overriding the get method for nickName
            println("The returned value is $field")
            return field
        }

    init{ //init blocks execute in order. of the class and will always execute before constructors.
        println("Initializing person")
    }

    fun printInfo(){
        val nickNameToPrint = if(nickName != null) nickName else "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}