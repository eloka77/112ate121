fun main() {
    val nums = List(5) { readln().toInt() }
    println("${nums.maxOrNull()}, ${nums.minOrNull()}")
}