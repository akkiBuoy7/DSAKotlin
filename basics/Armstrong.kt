package basics

import kotlin.math.pow

fun isArmstrong(num: Int): Boolean {
    var total = 0
    var temp = num
    val digits = num.toString().length

    while (temp > 0) {
        val reminder = temp % 10
        total += reminder.toDouble().pow(digits.toDouble()).toInt()
        temp /= 10;
    }
    if (total == num) {
        return true
    }
    return false
}