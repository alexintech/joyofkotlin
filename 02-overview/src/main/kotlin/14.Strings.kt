import java.time.Instant
import java.time.ZoneId

fun main() {
    val name = "Alexandr"
    val date = Instant.now()

    // string interpolation
    println("$name's registration date: $date")
    // Alexandr's registration date: 2019-07-18T02:00:22.188575Z

    println("$name's registration date: ${date.atZone(ZoneId.of("America/Los_Angeles"))}")
    // Alexandr's registration date: 2019-07-17T19:00:22.188575-07:00[America/Los_Angeles]

    println("""This is the first line
                |and this is the second one.""".trimMargin())
    // This is the first line
    // and this is the second one.
}