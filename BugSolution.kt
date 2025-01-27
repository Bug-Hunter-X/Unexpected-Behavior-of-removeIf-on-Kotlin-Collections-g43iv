fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = list.filter { it % 2 == 0 }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = map.filter { it.value % 2 == 0 }.map { it.key }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it % 2 == 0 }.toSet()
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 3, 5]
}

//Alternative approach using iterator
fun main2(){
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iter = list.iterator()
    while (iter.hasNext()) {
        val element = iter.next()
        if (element % 2 == 0) {
            iter.remove()
        }
    }
    println(list)
}