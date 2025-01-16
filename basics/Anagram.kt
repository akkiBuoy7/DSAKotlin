package basics

fun anagram(s1:String, s2:String):Boolean{

    if(s1.length!=s2.length){
        return false
    }

    return s1.toList().sorted() == s2.toList().sorted()
}