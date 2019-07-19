fun <T> addAll(list1: MutableList<T>,
               list2: MutableList<T>) {
    for (elem in list2) list1.add(elem)
}

fun <T> addAllCovariant(list1: MutableList<T>,
                        list2: MutableList<out T>) {    // Make T covariant
    for (elem in list2) list1.add(elem)
}

fun main() {
    val s = "A string"
    val a: Any = s

    val ls = mutableListOf("A String")
    // val la: MutableList<Any> = ls       // CE: Type mismatch
    // la.add(42)

    val imls = listOf("A String")
    val imla = imls + 42        // Kotlin infers the type `List<Any>` for `imla`

    val ls2 = mutableListOf("A String")
    val la2: MutableList<Any> = mutableListOf()
    // addAll(la2, ls2)            // CE: Type mismatch

    addAllCovariant(la2, ls2)
    println(la2)                    // [A String]
}