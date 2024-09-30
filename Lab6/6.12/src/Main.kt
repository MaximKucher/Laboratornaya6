fun main() {

    val array = mutableListOf(10, 20, 30, 40, 50)

    val index1 = 1
    val index2 = 3


    println("Массив до обмена: $array")


    swap(array, index1, index2)


    println("Массив после обмена: $array")
}


fun swap(array: MutableList<Int>, index1: Int, index2: Int) {
    if (index1 in array.indices && index2 in array.indices) {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    } else {
        println("Индексы выходят за пределы массива.")
    }
}