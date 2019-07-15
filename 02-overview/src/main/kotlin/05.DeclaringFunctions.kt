fun add1(a: Int, b: Int): Int {
    return a + b
}

// expression syntax
fun add2(a: Int, b: Int): Int = a + b

fun add3(a: Int, b: Int) = a + b


// mixing the two syntaxes may have unexpected results
fun add4(a: Int, b: Int) = {
    a + b
}
