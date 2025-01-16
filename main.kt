import basics.*

fun main(args: Array<String>) {
    val result = anagram("mug", "gum")
    println("is Anagram kotlin $result")
    val result1 = isArmstrong(153)
    println("is Armstrong $result1")
    val result2 = isPrime(15)
    println("is Prime $result2")
    getFibonacci(7)
    println()
    val duplicates = usingHashSet(
        arrayOf(1, 2, 5, 6, 3, 2, 1)
    )
    println("Duplicates in array are :")
    duplicates.forEach { e ->
        print(" $e")
    }
    println()
    val duplicates1 = usingNestedLoops(
        arrayOf(1, 2, 5, 6, 3, 2, 1)
    )
    println("Duplicates in array are :")
    duplicates1.forEach { e ->
        print(" $e")
    }
    println()
    val duplicates2 = usingNestedLoops(
        arrayOf(1, 2, 5, 6, 3, 2, 1)
    )
    println("Duplicates in array are :")
    duplicates2.forEach { e ->
        print(" $e")
    }
    println()
    println("Common elements in arrays are : ")
    val commons = usingHashSet(
        arrayOf(1, 2, 9, 3, 5, 6),
        arrayOf(1, 2, 5, 6, 10, 55)
    )
    commons.forEach { e ->
        print(" $e")
    }
    println()
    println("Common elements in arrays are : ")
    val commons1 = usingNestedLoops(
        arrayOf(1, 2, 9, 3, 5, 6),
        arrayOf(1, 2, 5, 6, 10, 55)
    )
    commons1.forEach { e ->
        print(" $e")
    }
    println()
    println("Common elements in arrays are : ")
    val commons2 = usingSorting(
        arrayOf(1, 2, 9, 3, 6, 5),
        arrayOf(1, 2, 6, 10, 5)
    )
    commons2.forEach { e ->
        print(" $e")
    }
    println()
    println("Duplicate words are: ")
    val sent1 = "This is sent1"
    val sent2 = "that inns sent2"
    val duplicateWords = usingHashSetFindDuplicateWords(sent1, sent2)
    for (w in duplicateWords) {
        print("$w ")
    }
    println()
    println("Duplicate words are: ")
    val duplicateWords2 = usingNestedLoopsFindDuplicates(sent1, sent2)
    for (w in duplicateWords2) {
        print("$w ")
    }
    println()
    println("Reversed number is: ${reverseNumber(123)}")
    println()
    val input = "bubs"
    println("$input is palindrome : ${palindrome(input)}")
    println()
    println("Reversed array is : ")
    val arrToReverse = arrayOf(1,2,3,4,5)
    val arrToReverse2 = arrayOf(0,10,20,30)
    val reversedArray1 = reverseArrayUsingSwap(arrToReverse)
    for (i in reversedArray1){
        print("$i ")
    }
    println()
    val reversedArray2 = reverseArrayUsingLoop(arrToReverse2)
    for (j in reversedArray2){
        print("$j ")
    }

    println()

    println(reverseSentence("Hi I am Akash"))

    println()
    val hashMapOfNoOfChars = noOfCharactersInString("Akash")
    hashMapOfNoOfChars.forEach { (t, v) ->
        print("$t = $v ")
    }
    println()
    println("Top 3 max values are:")
    getTop3MaxValues(intArrayOf(10,55,200,9,550,900,45,30)).forEach { v ->
        print("$v ")
    }
    println()
    println("Top 3 min values are:")
    getTop3MinValues(intArrayOf(10,55,200,9,550,900,45,30)).forEach { v ->
        print("$v ")
    }
}