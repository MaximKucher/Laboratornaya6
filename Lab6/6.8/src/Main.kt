fun main() {

    val array = arrayOf(10, 20, 30, 40, 50)

    val target = 30


    val index = array.indexOf(target)

    if (index != -1) {
        println("Элемент $target найден на индексе $index.")
    } else {
        println("Элемент $target не найден в массиве.")
    }
}