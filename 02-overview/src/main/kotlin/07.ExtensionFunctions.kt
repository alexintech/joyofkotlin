fun <T> List<T>.length() = this.size

fun List<Int>.product(): Int = this.fold(1) { a, b -> a * b }

fun main() {
    val ints = listOf(1, 2, 3, 4, 5, 6, 7)
    val listLength = ints.length()
    println(listLength)             // 7

    val product = ints.product()
    println(product)                // 5040
}