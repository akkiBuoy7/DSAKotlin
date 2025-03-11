package basics

fun getTop3MaxValues(input: IntArray): IntArray {
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    var third = Int.MIN_VALUE

    for (v in input) {

        when {
            v > first -> {
                third = second
                second = first
                first = v
            }
            v > second && v != first -> {
                third = second
                second = v
            }
            v > third && v != second -> {
                third = v
            }
        }

    }
    return intArrayOf(first, second, third)
}


fun getTop3MinValues(input: IntArray): IntArray {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE
    var third = Int.MAX_VALUE

    for (v in input) {

        when {
            v < first -> {
                third = second
                second = first
                first = v
            }
            v < second && v != first -> {
                third = second
                second = v
            }
            v < third && v != second -> {
                third = v
            }
        }

    }
    return intArrayOf(first, second, third)
}

fun getMaxMin(input: IntArray): Pair<Int, Int> {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    input.forEach { d ->
        if (d < min) {
            min = d
        } else if (d > max) {
            max = d
        }
    }
    return Pair(max, min)
}