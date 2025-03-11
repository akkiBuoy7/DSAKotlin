package basics

fun sortZeroToEnd(input: IntArray): IntArray {

    var j =0
    for (i in input.indices){
        if (input[i]!=0){
            val temp = input[j]
            input[j] = input[i]
            input[i] = temp
            j++
        }
    }

    return input
}