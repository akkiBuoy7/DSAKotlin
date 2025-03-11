package algos

fun binarySearch(intArray: IntArray, target: Int): Int {
/*
Time Complexity:
Best case: O(1) (when the target is at the middle).
Worst case: O(log n) (when the search space is halved each time).
*/

    var left = 0
    var right = intArray.size - 1



    while (left <= right) {
        val middle = left + (right - left) / 2
        when {
            intArray[middle] == target -> return middle
            intArray[middle] > target -> right = middle - 1
            else -> left = middle + 1

        }
    }

    return -1
}