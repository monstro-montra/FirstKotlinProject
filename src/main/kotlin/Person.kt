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
        val nickNameToPrint = nickName ?: "no nickname" //?: is the elvis operator.
        // check what is on the left side, if whatever on the left side of operator is not null, go ahead and return that expression.
        //otherwise, return what is on the right side of the operator. (?:)
        println("$firstName ($nickNameToPrint) $lastName")
    }

}