fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val list = listOf(a, b, c).sortedDescending()
    println("${list[0]}, ${list[1]}, ${list[2]}")
}