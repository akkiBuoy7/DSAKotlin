package algos

/*
Best Case Time Complexity: O(n) (with optimized algorithm to detect no swaps)
Average Case Time Complexity: O(n²)
Worst Case Time Complexity: O(n²)
Space Complexity: O(1)
Thus, Bubble Sort is efficient in the best case (if the array is already sorted)
but inefficient in the average and worst cases due to its O(n²) time complexity.
It is not the best algorithm for large datasets because of this quadratic growth.
*/
fun bubbleSort(input: IntArray): IntArray {
    val n = input.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) { // ignoring the already sorted ith element
            if (input[j] > input[j + 1]) {
                val temp = input[j]
                input[j] = input[j + 1]
                input[j + 1] = temp
            }
        }
    }
    return input
}
