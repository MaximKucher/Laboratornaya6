import kotlin.random.Random

fun main() {
    val array = IntArray(20) { Random.nextInt(1, 101) }

    println("Массив случайных чисел: ${array.joinToString(", ")}")
}
