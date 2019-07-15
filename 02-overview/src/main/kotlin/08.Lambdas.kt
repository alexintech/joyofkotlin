fun triple(list: List<Int>): List<Int> = list.map({ a -> a * 3 })

// when the lambda is the last argument of a function, it can be put outside of the ()
fun triple2(list: List<Int>): List<Int> = list.map { a -> a * 3 }

fun product(list: List<Int>): Int = list.fold(1) { a, b -> a * b }


// Compilation error: Type mismatch
// fun List<Int>.product2(): Int = this.fold(1) { (a, b) -> a * b }

// specifying lambda parameter types
fun List<Int>.product2(): Int = this.fold(1) { a: Int, b: Int -> a * b }

// multi-line lambdas
fun List<Int>.product3(): Int = this.fold(1) { a, b ->
    val result = a * b
    result
}


// simplified syntax for lambdas with a single parameter
fun triple3(list: List<Int>): List<Int> = list.map { it * 3 }

// lambdas in closures
val multiplier = 3
fun multiplyAll(list: List<Int>): List<Int> = list.map { it * multiplier }

fun multiplyAll(list: List<Int>, multiplier: Int): List<Int> = list.map { it * multiplier }