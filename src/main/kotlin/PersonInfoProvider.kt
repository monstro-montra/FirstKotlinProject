interface PersonInfoProvider { //interface declaration
    val providerInfo : String //cant instantiate this in an interface
    fun printInfo(person: Person){ //unlike java, you can implement logic into a function for an interface
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionID(): String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider { //class that implements PersonInfoProvider
    //does not need implementation function
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional statement")
    }

    override fun getSessionID(): String {
        return "Session"
    }
}

fun main(){
    val provider = BasicInfoProvider() //instantiate BasicInfoProvider object

    provider.printInfo(Person())

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider) {
        println("is not a session info provider")
    } else {
        println("is a session info provider")
        infoProvider.getSessionID()
    }
}
