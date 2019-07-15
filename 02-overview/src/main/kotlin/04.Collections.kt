fun main(args: Array<String>) {
    // immutable collections
    val list1 = listOf(1, 2, 3)
    val list2 = list1 + 4
    val list3 = list1 + list2

    println(list1)      // [1, 2, 3]
    println(list2)      // [1, 2, 3, 4]
    println(list3)      // [1, 2, 3, 1, 2, 3, 4]

    // mutable collections
    val list4 = mutableListOf(1, 2, 3)
    val list5 = list4.add(4)
    val list6 = list4.addAll(list4)

    println(list4)      // [1, 2, 3, 4, 1, 2, 3, 4]
    println(list5)      // true
    println(list6)      // true

}