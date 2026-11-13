import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val menor = if (a < b) a else b
    val maior = if (a > b) a else b
    println(menor.pow(2))
    if (maior >= 0) println(sqrt(maior))
}