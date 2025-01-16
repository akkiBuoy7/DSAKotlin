package basics

import kotlin.collections.HashMap

fun noOfCharactersInString(input:String):HashMap<Char,Int>{
    val temp = input.lowercase()
    val result = hashMapOf<Char,Int>()
    for (c in temp) {
        if (c.isLetter()) { // Optional: only count letters, ignore other characters.
            result[c] = result.getOrDefault(c, 0) + 1
        }
    }
    return result
}