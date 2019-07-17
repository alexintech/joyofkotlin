fun main() {
    val a: Int = 6
    val b: Int = 8

    // both if .. else blocks are mandatory if expression style used
    val s = if (a < b)
                "a is smaller than b"
            else
                "a is not smaller than b"
    println(s)      // a is smaller than b


    val percent = if (b != 0) {
                      val temp = a / b
                      temp * 100    // the value of the block
                  } else {
                      0             // the value of the block
                  }

    println(percent)    // 0


    val country = "Bolivia"
    val capital = when (country) {
        "Australia" -> "Canberra"
        "Bolivia"   -> "Sucre"
        "Brazil"    -> "Brasilia"
        else        -> "Unknown"
    }
    println(capital)     // Sucre

    val tired: Boolean = true
    val capital2 = when {
        tired                  -> "Check for yourself"
        country == "Australia" -> "Canberra"
        country == "Bolivia"   -> "Sucre"
        country == "Brazil"    -> "Brasilia"
        else                   -> "Unknown"
    }
    println(capital2)   // Check for yourself

    // Loops
    for (i in 0 until 10 step 2) {
        println(i)
    }

    // infix notation
    val range = 0 until 10 step 2
    for (i in range) println(i)

    // until and step are functions of Int
    for (i in 0.until(10).step(2)) println(i)
}