fun main() {

    val numbers = arrayOf(1, 2, 3, 2, 4, 5, 1, 6, 4)


    val uniqueNumbers = numbers.toSet()


    println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")
}