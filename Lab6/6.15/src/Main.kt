fun main() {

    val array = arrayOf(1, 2, 3, 2, 1)


    val isPalindrome = checkPalindrome(array)

    if (isPalindrome) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}

fun checkPalindrome(array: Array<Int>): Boolean {
    val n = array.size
    for (i in 0 until n / 2) {
        if (array[i] != array[n - 1 - i]) {
            return false
        }
    }
    return true
}
