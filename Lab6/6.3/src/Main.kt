fun main() {
    val numbers = arrayOf(34, 12, 5, 67, 23, 89, 1, 45, 78, 9)

    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()

    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}