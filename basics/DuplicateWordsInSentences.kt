package basics

fun usingHashSetFindDuplicateWords(sent1: String, sent2: String): ArrayList<String> {
    val duplicates = arrayListOf<String>()
    val h1 = hashSetOf<String>()
    val h2 = hashSetOf<String>()

    h1.addAll(sent1.split(" "))
    h2.addAll(sent2.split(" "))
    h1.retainAll(h2)

    if (h1.isNotEmpty()) {
        duplicates.addAll(h1)
    } else {
        println("No duplicates")
    }
    return duplicates
}

fun usingNestedLoopsFindDuplicates(sent1: String, sent2: String): ArrayList<String> {
    val duplicates = arrayListOf<String>()

    val words1 = sent1.split(" ")
    val words2 = sent2.split(" ")

    for (w1 in words1) {
        for (w2 in words2) {
            if (w1 == w2 && !duplicates.contains(w1)) {
                duplicates.add(w1)
            }
        }
    }
    if (duplicates.isEmpty()){
        println("No duplicates")
    }
    return duplicates
}