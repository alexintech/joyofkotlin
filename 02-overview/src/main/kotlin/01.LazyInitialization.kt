fun main(args: Array<String>) {

    val name: String by lazy { getName() }
    println("hey1")
    val name2: String by lazy { name }
    println("hey2")
    val name3: String by lazy ( ::getName )     // the same as { getName() }
    println("hey3")

                        // computing name...
    println(name)       // Mickey
    println(name2)      // Mickey
    println(name)       // Mickey
    println(name2)      // Mickey

                        // computing name...
    println(name3)      // Mickey


    lateinit var name4: String
    name4 = getName()
}

fun getName(): String {
    println("computing name...")
    return "Mickey"
}