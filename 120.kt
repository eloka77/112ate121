fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val list = listOf(a, b, c).sorted()
    println("${list[2]}, ${list[1]}, ${list[0]}")
}