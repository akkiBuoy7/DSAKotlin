package basics

fun usingHashSet(input: Array<Int>): IntArray {

    val seen = hashSetOf<Int>()
    val duplicates = hashSetOf<Int>()

    for (ele in input) {
        if (!seen.add(ele)) {
            duplicates.add(ele)
        }
    }
    val result = duplicates.toIntArray()
    if (duplicates.isEmpty()) {
        println("No duplicates found")
    }
    return result
}

fun usingNestedLoops(input: Array<Int>): ArrayList<Int> {
    val result = arrayListOf<Int>()
    for (i in 0..input.size) {
        for (j in i + 1 until input.size) {
            if (input[i] == input[j]) {
                result.add(input[i])
            }
        }
    }
    return result;
}

fun usingSorting(input: Array<Int>): ArrayList<Int> {
    val result = arrayListOf<Int>()
    input.sort()
    for (i in 1..input.size) {
        if (input[i] == input[i - 1]) {
            result.add(input[i])
        }
    }
    return result
}