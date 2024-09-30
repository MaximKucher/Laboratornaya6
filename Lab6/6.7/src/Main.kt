fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5)


    println("Исходный массив: ${numbers.joinToString(", ")}")


    val reversedNumbers = numbers.reversedArray()

 
    println("Реверсированный массив: ${reversedNumbers.joinToString(", ")}")
}