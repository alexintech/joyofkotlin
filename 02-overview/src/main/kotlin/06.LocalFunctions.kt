fun sumOfPrimes(limit: Int): Long {

    val seq: Sequence<Long> = sequenceOf(2L) +
            generateSequence(3L, {
                it + 2
            }).takeWhile {
                it < limit
            }

    // Declaring local function
    fun isPrime(n: Long): Boolean =
        seq.takeWhile {
            it * it <= n
        }.all {
            n % it != 0L
        }

    return seq.filter(::isPrime).sum()
}


// the equivalent without local function
fun sumOfPrimes2(limit: Int): Long {

    val seq: Sequence<Long> = sequenceOf(2L) +
            generateSequence(3L, {
                it + 2
            }).takeWhile {
                it < limit
            }

    return seq.filter {
        x -> isPrime(x, seq)
    }.sum()
}

fun isPrime(n: Long, seq: Sequence<Long>): Boolean =
        seq.takeWhile {
            it * it <= n
        }.all {
            n % it != 0L
        }

fun main() {
    println(sumOfPrimes(10))        // 17
    println(sumOfPrimes(10))
}