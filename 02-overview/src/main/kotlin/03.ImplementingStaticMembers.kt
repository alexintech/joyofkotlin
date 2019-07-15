package listing03

import java.time.Instant

data class Person(val name: String,
                  val registered: Instant = Instant.now()) {

    companion object {
        fun create(xml: String): Person {
            TODO("Write an implementation creating " +
                    "a Person from an xml string")
        }
    }
}

fun main(args: Array<String>) {
    Person.create("<name>BOB</name>")
    Person.Companion.create("<name>BOB</name>")     // the same as Person.create()
}