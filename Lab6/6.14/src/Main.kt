import kotlin.random.Random

fun main() {

    val array = IntArray(20) { Random.nextInt(1, 101) }


    println("Оригинальный массив: ${array.joinToString(", ")}")


    val divisibleByThree = array.filter { it % 3 == 0 }

    println("Числа, делящиеся на 3: ${divisibleByThree.joinToString(", ")}")
}
