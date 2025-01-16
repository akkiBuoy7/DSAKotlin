package basics

import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num < 1) {
        return false
    }

    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}