package basics

fun usingHashSet(input1: Array<Int>, input2: Array<Int>): ArrayList<Int> {
    val result = arrayListOf<Int>()
    val hashSet = hashSetOf<Int>()

    hashSet.addAll(input1)

    for (i in input2.indices) {
        if (hashSet.contains(input2[i])) {
            result.add(input2[i])
        }
    }
    return result
}

fun usingNestedLoops(input1: Array<Int>, input2: Array<Int>): ArrayList<Int> {
    val result = arrayListOf<Int>()

    for (i in input1.indices) {
        for (j in input2.indices) {
            if (input1[i] == input2[j]) {
                result.add(input1[i])
            }
        }
    }
    return result
}

fun usingSorting(input1: Array<Int>, input2: Array<Int>): ArrayList<Int> {
    val result = arrayListOf<Int>()
    input1.sort()
    input2.sort()

    var i = 0
    var j = 0
    while (i < input1.size && j < input2.size) {
        if (input1[i] == input2[j]) {
            result.add(input1[i])
            i++
            j++
        } else if (input1[i] < input2[j]) {
            i++
        } else {
            j++
        }
    }
    return result
}