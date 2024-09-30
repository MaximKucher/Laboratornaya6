fun main() {

    val numbers = arrayOf(34, 12, 5, 67, 23, 89, 1, 45, 78, 9)

    bubbleSort(numbers)

    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}

fun bubbleSort(arr: Array<Int>) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {

                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}