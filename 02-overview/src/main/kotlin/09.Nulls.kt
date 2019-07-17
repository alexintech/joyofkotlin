fun main() {
    val x: Int = 3
    val y: Int? = x
    println(y)                // 3

    val x1: Int? = 3
    // val y1: Int = x1       // CE: type mismatch

    val s: String? = null
    // val l = s.length       // CE: . (dereferencing operator) can't be used here because it could
                              // cause an NPE

    val l = if (s != null) s.length else null
    val l2 = s?.length        // using ?. (safe call operator)

    // city is null if any of component is missing
    // val city: City? = map[companyName]?.manager?.address?.city

    // if anything is null, an NPE will be thrown
    // val city: City? = map[companyName]!!.manager!!.address!!.city

    // if anything is null, a special default value is used. ?: - Elvis operator
    // val city: City? = map[companyName]?..manager?.address?.city ?: City.UNKNOWN
}