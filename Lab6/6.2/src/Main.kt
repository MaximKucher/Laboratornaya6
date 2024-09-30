fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5)


    var sum = 0


    for (number in numbers) {
        sum += number
    }

    println("Сумма элементов массива: $sum")
}