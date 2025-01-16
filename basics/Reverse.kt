package basics

fun reverseNumber(num: Int): Int {
    var temp = num

    if (num.toString().length == 1) {
        return num
    }
    var result = 0
    while (temp > 0) {
        val rem = temp % 10
        result = result * 10 + rem
        temp /= 10
    }
    return result
}

fun palindrome(input: String): Boolean {
    val reverse = StringBuilder()
    for (i in input.length - 1 downTo 0) {
        reverse.append(input[i])
    }
    return reverse.toString() == input
}

fun reverseArrayUsingSwap(input: Array<Int>): Array<Int> {

    var start = 0
    var end = input.size - 1

    while (start < end) {
        val t = input[start]
        input[start] = input[end]
        input[end] = t

        start++
        end--
    }
    return input
}

fun reverseArrayUsingLoop(input: Array<Int>): Array<Int> {
    val result: Array<Int> = Array(input.size) { 0 }
    for ((j, i) in (input.size - 1 downTo 0).withIndex()) {
        result[j] = input[i]
    }
//    for (i in input.size - 1 downTo 0) {
//        result[j] = input[i]
//        j++
//    }
    return result
}


fun reverseSentence(input: String): String {
    val arrS = input.split(" ")
    val result = arrayListOf<String>()
    for (i in arrS.size - 1 downTo 0) {
        result.add(arrS[i])
    }
    var rev = result.joinToString { "" }
    for (j in result) {
        rev += "$j "
    }
    return rev
}

fun reverseSentenceJoin(input: String): String {
    return input.split(" ").reversed().joinToString(" ")
}