
fun main(args: Array<String>) {
    val num: Int = try {
        args[0].toInt()
    } catch (e: Exception) {
        0
    } finally {
        // Code in this block is always executed
    }

    println(num)        // 0 (if no args)
}