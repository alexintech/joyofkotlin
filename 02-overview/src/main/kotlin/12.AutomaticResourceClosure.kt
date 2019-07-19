import java.io.File

fun main() {
    File(ClassLoader.getSystemResource("myFile.txt").file).inputStream()
            .use { it.bufferedReader()
                    .lineSequence()
                    .forEach(::println)
            }

    val lines: Sequence<String> = File(ClassLoader.getSystemResource("myFile.txt").file)
            .inputStream()
            .use {
                it.bufferedReader()
                  .lineSequence()
            }
//    lines.forEach(::println)    // IOException: Stream Closed

    val lines2: List<String> = File(ClassLoader.getSystemResource("myFile.txt").file)
            .inputStream()
            .use {
                it.bufferedReader()
                        .lineSequence()
                        .toList()
            }
    lines2.forEach(::println)

    File(ClassLoader.getSystemResource("myFile.txt").file).forEachLine { println(it) }

    File(ClassLoader.getSystemResource("myFile.txt").file).useLines { it.forEach(::println) }

}