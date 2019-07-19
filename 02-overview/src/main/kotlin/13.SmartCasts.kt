fun main() {
    val payload: Any = "Hello, World!"

    // Smart cast
    val length: Int = if (payload is String)
        payload.length
    else
        -1

    // smart cast with when
    val result: Int = when (payload) {
        is String -> payload.length
        is Int    -> payload
        else      -> -1
    }

    // unsafe casting, ClassCastException may be thrown
    val result1: String = payload as String

    // if the cast doesn't succeed, the result will be null
    val result2: String? = payload as? String


    // Identity (referential equality) is tested with === and !==
    // Equality (structural equality) is tested with == and != (a shorthand for equals())
}